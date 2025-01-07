package coreJavaBasics;

public class passFail {
  public static void main(String args[])
  {
	  int [] std1marks= {50,60,39,35,77};
	  int [] std2marks= {40,30,29,35,17};
	  int [] std3marks= {50,30,39,35,77};
	  int std1=0,std2=0,std3=0;
	  for(int i=0;i<std1marks.length;i++)
	  {
		  if(std1marks[i]<35)
			  std1++;
		  else if(std2marks[i]<35)
			  std2++;
		  else if(std3marks[i]<35)
			  std3++;	  
	  }
	  int student=0;
	  switch(student)
	  {
	  case 1:
	  if(std1>=3)
		  System.out.println("Student 1 Failed");
	  else 
		  System.out.println("Student 1 Passed");
	  break;
	  
	  case 2:
	  if(std2>=3)
		   System.out.println("Student 2 Failed");
	  else 
		   System.out.println("Student 2 Passed");
	  break;
	  
	  case 3:
	  if(std3>=3)
		   System.out.println("Student 3 Failed");
	   else 
		   System.out.println("Student 3 Passed");
	  break;
	  
	  default:
		  System.out.println("Invalid Sudent Details");
  }
}
}
