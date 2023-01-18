/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) 
	{
		//code
		 Scanner sc=new Scanner(System.in);
         int T=sc.nextInt();
         while(T>0)
         {
             int N=sc.nextInt();
             int D=sc.nextInt();
             int A[]=new int[N];
             for(int i=0;i<N;i++)
             {
                 A[i]=sc.nextInt();
             }
          for(int i=D;i<N;i++)
          {
             System.out.print(A[i] + " ");
          }
          for(int i=0;i<D;i++)
          {
             System.out.print(A[i] +" ");
          }
         System.out.println();
         T--;
       }
	}
}