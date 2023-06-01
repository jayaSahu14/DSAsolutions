package DataStructures.Hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequenciesOfArrayElements {

    public static void main (String[] args) {
        int arr[] = new int[]{15, 16, 27, 27, 28, 15};
        int n = arr.length;
        
        countFreq(arr, n);
        System.out.println("--------------");
        countFreq1(arr,n);
    }
    
    static void countFreq(int arr[], int n)
    {
        Map<Integer, Integer> hmp = new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++)
        {
            int key = arr[i];
            if(hmp.containsKey(arr[i]) == true)
              hmp.put(arr[i], hmp.get(arr[i]) + 1);
            else
              hmp.put(arr[i], 1);    
        }
    
          System.out.println(hmp); 
        
//       for(Map.Entry<Integer, Integer> itr: hmp.entrySet())
//        System.out.println(itr.getKey() + " " + itr.getValue());
    }
    
    static void countFreq1(int arr[], int n) {
    HashMap<Integer, Integer> cnt = new HashMap<>();
	for (int i : arr) {
		cnt.put(i, cnt.getOrDefault(i, 0) + 1);
	}
	System.out.println(cnt);
    }
}