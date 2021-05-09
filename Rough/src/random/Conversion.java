package random;

public class Conversion 
{


	public static void main(String[] args) 
	{
		printpattern();
			String aa="50000";
		String bb="LSL50000";

		String temp = bb.replaceAll("[0-9]", "");

		System.out.println("String is :"+ temp);
		 
	}
	static void printpattern()
	{
		int i,j;

			for(i=0;i<=6;i++)
		{
			for(j=1;j<=7-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		 

		for(i=1;i<=7;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int k=7-i;k>=1;k--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}

//public class Conversion
//{
// 
//    /* Returns the sum of series */
//    public static int sumOfSeries(int n)
//    {
//        int sum = 0;
//        for (int x=1; x<=n; x++)
//        {
//        	int k=x*x*x;
//            sum =sum+k;
//        }
//            return sum;
//    }
// 
//// Driver Function
//    public static void main(String[] args)
//    {
//        int n = 5;
//        System.out.println(sumOfSeries(n));
// 
//    }
//}
//
