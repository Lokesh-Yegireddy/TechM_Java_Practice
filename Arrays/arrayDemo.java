package Arrays;
import java.util.Scanner;
public class arrayDemo {
      public static void main(String args[])
      {   
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter How Many Values You Want To Insert Into Array");
    	  int n=sc.nextInt();
    	  int [] arr=new int[n];
    	  System.out.println("Enter "+n+" Values Into Array");
    	  for(int i=0;i<n;i++) {
    		  arr[i]=sc.nextInt();
    	  }
    	  //Forward Tracing
    	  System.out.println("Array Elements");
    	  for(int i=0;i<arr.length;i++)
    	  {
    		  System.out.print(" "+arr[i]);
    	  }
    	  System.out.println();
    	  System.out.println("Array Elements In Reverse Order");
    	  for(int i=arr.length-1;i>=0;i--)
    	  {
    		  System.out.print(" "+arr[i]);
    	  }
    	
      }
}
