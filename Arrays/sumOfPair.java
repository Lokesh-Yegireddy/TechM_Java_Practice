package Arrays;

import java.util.Scanner;

public class sumOfPair {
	public static void main(String args[]) {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter How Many Values You Want To Insert Into Array");
	 	  int n=sc.nextInt();
	 	  int [] arr=new int[n];
	 	  System.out.println("Enter "+n+" Values Into Array");
	 	  for(int i=0;i<n;i++) {
	 		  arr[i]=sc.nextInt();
	 	  }
	 	  System.out.println("Enter Sum Value ");
   	      int sum=sc.nextInt();
   	   System.out.println("pair of array values :");
	 	  for(int i=0;i<arr.length;i++)
	    	  {
	    		for(int j=i;j<arr.length;j++)
	    		{
	    			if(arr[i]+arr[j]==sum && i!=j)
	    				System.out.println("("+arr[i]+" "+arr[j]+")");
	    		}
	    	  }   
}
}
