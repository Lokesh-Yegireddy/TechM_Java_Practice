package Arrays;
import java.util.Scanner;
public class evenOdd {
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
		    	  
		    	  
		    	  int evenCount=0,oddCount=0;
		    	  for(int i=0;i<arr.length;i++)
		       	  {
		       		if(arr[i]%2==0)
		       			evenCount++;
		       		else
		       			oddCount++;
		       	  }
		    	  
		    	  
		    	  int[] evenNumbers=new int[evenCount];
		    	  int[] oddNumbers=new int [oddCount];
		    	  int evenIndex=0,oddIndex=0;
		    	  for(int i=0;i<arr.length;i++)
		    	  {    
		    		  if(arr[i]%2==0)
		    		    evenNumbers[evenIndex++]=arr[i];
		       		else
		       			oddNumbers[oddIndex++]=arr[i];
		       	  }
		    		  
		    	  
		    	  
		    	  System.out.print("Even Numbers: ");
		          for (int num : evenNumbers) {
		              System.out.print(num + " ");
		          }
		          
		          

		          System.out.println(); // For a new line

		          
		          
		          System.out.print("Odd Numbers: ");
		          for (int num : oddNumbers) {
		              System.out.print(num + " ");
		          }
		    	  }
		  
		    	 
	
	}
	
