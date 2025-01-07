package Patterns;

public class numberPattern2 {
	 public static void main(String args[]) {
	        System.out.println("Pattern");
	         for(int i=1;i<=5;i++)
	         {
	        	 for(int j=1;j<i;j++)
	        	 {
	        		 System.out.print(j+" ");
	        	 }
	        	 System.out.println();
	         }
	         
	         System.out.println();
	         System.out.println("Reverse Pattern");
	         System.out.println();
	         for(int i=5;i>=1;i--)
	         {
	        	 for(int j=1;j<i;j++)
	        	 {
	        		 System.out.print(j+" ");
	        	 }
	        	 System.out.println();
	         }
	         
	         /*
	          Pattern

1 
1 2 
1 2 3 
1 2 3 4 

Reverse Pattern

1 2 3 4 
1 2 3 
1 2 
1 


	          */
	}
}
