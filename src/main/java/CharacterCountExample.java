
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCountExample {
    public static void main(String[] args) {
        String str = "Capgemini";
        Map<Character, Integer> hm = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Check if the character is already in the map
            if (hm.containsKey(currentChar)) {
                // If yes, increment its count
                hm.put(currentChar, hm.get(currentChar) + 1);
            } else {
                // If not, add it to the map with count 1
                hm.put(currentChar, 1);
            }
        }

        // Display the character count map
        System.out.println("Character Count: " + hm);
    }
}
