package DataStructures.Arrays;

public class PrefixSum {
	

    static int getSumNaive(int arr[], int l, int r)
    {
    int res= 0;
    
    for(int i=l; i<=r; i++)
        res+= arr[i];
        
    return res;
    }


    static int getSum(int ps[], int l, int r){
        
        if(l==0)
            return ps[r];
            
        return ps[r]-ps[l-1];
        
    }


        public static void main(String args[]) 
        { 
            int arr[]={2, 8, 3, 9, 6, 5, 4};
            
            int n=7;
            
            int ps[]=new int[n];
            
            ps[0] = arr[0];
            
            for(int i=1; i<n; i++)
                ps[i] = ps[i-1]+ arr[i];
                
           System.out.println(getSum(ps, 1, 3));

        } 
}

// make a array which is sum of all prev elements, 
/* a[0]=0, a[1]=0+1, a[2]=0,1,2
then to find prefix sum, use  getsum(l,r)= psum(r)- psum(l-1);
*/