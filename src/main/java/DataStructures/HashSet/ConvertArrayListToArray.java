package DataStructures.HashSet;
import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayListToArray {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Convert the ArrayList to an array using Arrays.asList()
        Integer[] array = Arrays.asList(list).toArray(new Integer[0]);

        // Print the array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

