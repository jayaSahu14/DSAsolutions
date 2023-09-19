package DataStructures.Arrays.Solve;

public class MatchStickGame {
	
	static int matchGame(Long N) {
        long a=N%5;
      
       if(a==1){
           return 1;
           
       }if(a==2){
           return 2;
       }if(a==3){
           return 3;
       }if(a==4){
           return 4;
       }    
      return -1; 
    } 
}
