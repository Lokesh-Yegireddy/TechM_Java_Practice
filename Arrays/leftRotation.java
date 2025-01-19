
package Arrays;
import java.util.*;
public class leftRotation {
	public static void main(String args[]) {
		System.out.println("Before Rotation");
		int arr[]= {1,2,3,4,5};
		 System.out.println(Arrays.toString(arr)); 
		int i;
		System.out.println("Enter Number Of Rotations");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		while(n!=0) 
		{  
		int temp=arr[0];
		for( i=0;i<arr.length;i++)
		{ 
        if(i!=arr.length-1)
			arr[i]=arr[i+1];
		else
			  arr[i]=temp;
		}
		 n--;
	    }
		 System.out.println("After Rtation"); 
		 System.out.println(Arrays.toString(arr)); 
		}
	
}
