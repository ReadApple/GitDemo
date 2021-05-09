
package random;

import java.util.Scanner;

public final class PrimeNumber
{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number :");
		int n=sc.nextInt();
		int i,flag=0;
	
		for(int m=2;m<=n/2;m++)
		{
			if(n%m==0)
		{
			System.out.println("The number is not prime :" +n);
			flag=1;
		}
		if(flag==0)
			System.out.println("The number is prime :" +n);
		flag=0;
		}
		}
		
		
		

	

}	

