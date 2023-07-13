package DataStructures.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindTriplets {
	
	
	public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        // Sort the array
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    // Found a triplet with zero sum
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    // Skip duplicate elements for j
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }

                    // Skip duplicate elements for k
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }

                    // Move the pointers
                    j++;
                    k--;
                } else if (sum < 0) {
                    // Sum is less than zero, increment j to increase the sum
                    j++;
                } else {
                    // Sum is greater than zero, decrement k to decrease the sum
                    k--;
                }
            }
        }
           return ans;
    }
	
	public boolean findTriplets(int arr[] , int n)
    {
      Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currentSum = arr[i] + arr[left] + arr[right];
                if (currentSum == 0) {
                    return true;
                }
                if (currentSum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return false;
    }
	
	
	public boolean findTriplets1(int arr[] , int n){
        int target=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<n;i++) {
           map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<n;i++) {
            int twoSum=target-arr[i];
            if(map.get(arr[i])==1) {
                map.remove(arr[i]);
            }
            else {
                map.put(arr[i],map.get(arr[i])-1);
            }
            for(int j=i+1;j<n;j++) {
                int val=twoSum-arr[j];
                if(map.containsKey(val) && val!=arr[j]) return true;
                else if(map.containsKey(val) && val==arr[j] && map.get(val)>1) return true; 
                
            }
            
            if(!map.containsKey(arr[i])) {
                map.put(arr[i],1);
            }
            else map.put(arr[i],map.get(arr[i])+1);
        }
        
        return false;
    }
}
	
	
	
	
	
	
	
	


