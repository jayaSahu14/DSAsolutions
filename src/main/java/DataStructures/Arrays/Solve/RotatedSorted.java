package DataStructures.Arrays.Solve;

public class RotatedSorted {

public static boolean checkRotatedAndSorted(int arr[], int num){
        
        // Your code here
       int f=0;
       for(int i=0;i<num-1;i++){
           if(arr[0]<arr[num-1]){
               break;
           }
           if(arr[i+1]<arr[i]){
               f++;
           }
       }
       int g=0;
       for(int i=0;i<num-1;i++){
           if(arr[0]>arr[num-1]){
               break;
           }
           if(arr[i+1]>arr[i]){
               g++;
           }
       }
        if(f==1||g==1){
            return true;
        }
        return false;
        
    }
    

}
