package Patterns;

public class numberPattern1 {
        public static void main(String args[]) {
        System.out.println("Pattern");
         for(int i=0;i<5;i++)
         {
        	 for(int j=0;j<i;j++)
        	 {
        		 System.out.print(i+" ");
        	 }
        	 System.out.println();
         }
         System.out.println();
         System.out.println("Reverse Pattern");
         System.out.println();
         for(int i=4;i>=0;i--)
         {
        	 for(int j=0;j<i;j++)
        	 {
        		 System.out.print(i+" ");
        	 }
        	 System.out.println();
         }
         
         /*Pattern

1 
2 2 
3 3 3 
4 4 4 4 

Reverse Pattern

4 4 4 4 
3 3 3 
2 2 
1 


          
          */
}
}
