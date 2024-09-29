package com.cg.basicprograms;

public class ArmstrongNo {
  public static void main(String args[]) {
	  int num=1534;
	  int temp=num;
	  int digitLength=String.valueOf(num).length();
	  int rem;
	  double sum=0;
	  while(num>0)
	  {
		 rem=num%10;
		 sum=sum+Math.pow(rem, digitLength);
		 num=num/10;
	  }
	  if(sum==temp)
	  {
	  System.out.println("It is Armstrong number");
  }
	  else
	  {
		  System.out.println("It is not a Armstrong number");
	  }
  }
}
