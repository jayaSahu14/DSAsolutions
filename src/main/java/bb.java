import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/folder")
public class bb {

    // Desktop path
    private static final String DESKTOP_PATH = System.getProperty("user.home") + "/Desktop/";

    // In-memory database to store folder structure
    private static Map<String, String> folderDatabase = new HashMap<>();

    // API to create a folder
    @PostMapping("/create")
    public String createFolder(@RequestParam String folderName) {
        String folderPath = DESKTOP_PATH + folderName;
        File folder = new File(folderPath);

        if (!folder.exists()) {
            if (folder.mkdir()) {
                folderDatabase.put(folderName, folderPath);
                return "Folder created successfully";
            } else {
                return "Failed to create folder";
            }
        } else {
            return "Folder already exists";
        }
    }

    // API to delete a folder and its contents
    @DeleteMapping("/delete")
    public String deleteFolder(@RequestParam String folderName) {
        if (folderDatabase.containsKey(folderName)) {
            String folderPath = folderDatabase.get(folderName);
            File folder = new File(folderPath);
            
            if (deleteFolderRecursive(folder)) {
                folderDatabase.remove(folderName);
                return "Folder deleted successfully";
            } else {
                return "Failed to delete folder";
            }
        } else {
            return "Folder not found";
        }
    }

    // Recursively delete a folder and its contents
    private boolean deleteFolderRecursive(File folder) {
        if (folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    deleteFolderRecursive(file);
                }
            }
        }
        return folder.delete();
    }

    // API to create an object in a particular folder
    @PostMapping("/createObject")
    public String createObjectInFolder(@RequestParam String folderName, @RequestParam String objectName) {
        if (folderDatabase.containsKey(folderName)) {
            String folderPath = folderDatabase.get(folderName);
            String objectPath = folderPath + "/" + objectName;

            try (FileWriter fileWriter = new FileWriter(objectPath)) {
                // You can write content to the object file if needed
                return "Object created successfully in folder: " + folderName;
            } catch (IOException e) {
                return "Failed to create object";
            }
        } else {
            return "Folder not found";
        }
    }

    // API to provide folder structure in nested JSON format
    @GetMapping("/explore")
    public Map<String, String> exploreFolders() {
        return folderDatabase;
    }
}
