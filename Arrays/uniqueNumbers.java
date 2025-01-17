package Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class uniqueNumbers {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter how many values u want in array");
	int n=sc.nextInt();
	//int [] arr= {1,2,6,6,8,12,12,14,14,15,18};
	int[] arr=new int [n];
	System.out.println("Enter values in array");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Before Sorting :"+Arrays.toString(arr));
	Arrays.sort(arr);
	System.out.println("After Sorting"+Arrays.toString(arr));
	System.out.println("Unique elements");
	if(arr.length!=0) {
	for(int i=0;i<arr.length;i++)
	{
		if(i==arr.length-1 && arr[i-1]!=arr[i]) {
			System.out.println(arr[i]);
			break;
		}
		for(int j=i;j<arr.length-1;j++)
		{   
			if(arr[i]==arr[j+1]) {
			
				break;}
			else {
				if(i>0 && arr[i-1]==arr[i]) 
					break;
				else {
					System.out.println(arr[i]);
				break;
				}
			}
		}
		}
	}
	else
		System.out.println("Empty Error :"+Arrays.toString(arr));
	
		
}}
			
