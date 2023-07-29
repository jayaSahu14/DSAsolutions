package MostImpQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

    public List<List<String>> groupAnagrams(String[] strs) {
       
     ArrayList<String> ans1 = new ArrayList<String>();
     ArrayList<List<String>> ans = new ArrayList<List<String>>();

        boolean arr[] = new boolean[strs.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        }
        boolean y = false;
        int j = 0;
        for (int i = 0; i < strs.length; i++) {
            ans1.add(strs[i]);
            if (arr[i] == true) {
                ArrayList<String> anagrams = new ArrayList<>();
                anagrams.add(strs[i]);
                for (j = i + 1; j < strs.length; j++) {
                    y = isAnagram(strs[i], strs[j]);
                    if (y == true) {
                        arr[j] = false;
                        anagrams.add(strs[j]);
                    }
                }
                ans.add(anagrams);
                ans1.clear(); // Clear the temporary list for the next group
            }
        }
        return ans;
    }

   public boolean isAnagram(String s, String t) {
        Map<Character, Integer> count = new HashMap<>();
        
        // Count the frequency of characters in string s
        for (char x : s.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }
        
        // Decrement the frequency of characters in string t
        for (char x : t.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) - 1);
        }
        
        // Check if any character has non-zero frequency
        for (int val : count.values()) {
            if (val != 0) {
                return false;
            }
        }
        
        return true;
    }
}