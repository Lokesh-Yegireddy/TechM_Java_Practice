package Arrays;

import java.util.Scanner;

public class sumOfArray {
	public static void main(String args[]) {
	   	   Scanner sc=new Scanner(System.in);
	   	   System.out.println("Enter How Many Values You Want To Insert Into Array");
	    	  int n=sc.nextInt();
	    	  int [] arr=new int[n];
	    	  int sum=0;
	    	  System.out.println("Enter "+n+" Values Into Array");
	    	  for(int i=0;i<n;i++) {
	    		  arr[i]=sc.nextInt();
	    	  }
	    	  
	    	  for(int i=0;i<arr.length;i++)
	       	  {
	       		 sum+=arr[i];
	       	  }
	    	  System.out.println("Sum of elements in array is :"+sum);
}
}