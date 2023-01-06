package DataStructures.String;

public class PatternSearchNaive {

	 public static void main(String args[]) 
	    {   String txt = "ABCABCD";String pat="ABCD";
	        System.out.print("All index numbers where pattern found: ");
	        patSearchinng(txt,pat);  
	    } 
	 
	 static void patSearchinng(String txt,String pat){  //naive
		 int m=pat.length(), n=txt.length();	 
		 for(int i=0;i<=(n-m);  ){
		        int j;
		        for(j=0;j<m;j++)
		        if(pat.charAt(j)!=txt.charAt(i+j))
		        break;
		        if(j==m)
		            System.out.print(i+" ");
		            if(j==0){
		            i++;}
		            else{
		            i=(i+j);}
		        }
		        }
		 
	 static void patSearchinngg(String txt,String pat){ //better naive
		    int m=pat.length(); int n=txt.length();
		    for(int i=0;i<=(n-m);  ){
		        int j;
		        for(j=0;j<m;j++)
		        if(pat.charAt(j)!=txt.charAt(i+j))
		        break;
		        
		        if(j==m)
		        System.out.print(i+" ");
		        if(j==0){
		        i++;}
		        else{
		        i=(i+j);}
		    }
		    }
	 
	 //rabin karp
	  static final int d=256;
	    static final int q=101; 
	 static void RBSearch(String pat,String txt,int M, int N){
		    
		    //Compute (d^(M-1))%q
		    int h=1;
		    for(int i=1;i<=M-1;i++)
		        h=(h*d)%q;
		    
		    //Compute p and to
		    int p=0,t=0;
		    for(int i=0;i<M;i++){
		        p=(p*d+pat.charAt(i))%q;
		        t=(t*d+txt.charAt(i))%q;
		    }
		    
		    for(int i=0;i<=(N-M);i++){
		       //Check for hit
		       if(p==t){
		           boolean flag=true;
		           for(int j=0;j<M;j++)
		                if(txt.charAt(i+j)!=pat.charAt(j)){flag=false;break;}
		            if(flag==true)System.out.print(i+" ");
		       }
		       //Compute ti+1 using ti
		       if(i<N-M){
		           t=((d*(t-txt.charAt(i)*h))+txt.charAt(i+M))%q;
		        if(t<0)t=t+q;
		       }
		    }
		    
		}
	 
	 
	 
	 
}
