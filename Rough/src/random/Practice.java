package random;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name : ");
		String s=sc.nextLine();
				//char[] ch=s.toCharArray();
//		int j=ch.length;
//
//		for(int i=1;i<10;i++)
//		{
//
//			System.out.println("Hello : "+i);
//			//System.out.print(ch[(j-1)-i]);
//		}
		 
		String rev="";
		int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		sc.close();
	}


}	


