package dp;

import java.util.Scanner;

public class Staris {


public static int countPaths(int n, int qb[]){
    if(n==0)return 1;
    if(n<0) return 0;
    
    if(qb[n]>0){
        return qb[n];
    }
    
    int a=countPaths(n-1,qb);
    int b=countPaths(n-2,qb);
    int c=countPaths(n-3,qb);
    
   int cp1= a+b+c;
    qb[n]=cp1;
    return cp1;
}

  public static void main(String[] args) throws Exception {
    // write your code here

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int cp = countPaths(n, new int[n + 1]);

  }}
