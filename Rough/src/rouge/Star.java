package rouge;

public class Star {

	
	public static void main(String[] args) {
		
//		for(int i=0;i<5;i++)
//		{										i=1
//			for(int j=0;j<=i;j++)				j=1					ooooo
											//  k=1
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		
	
//			for(int i=1;i<=5;i++)
//			{															
//				for(int j=4;j>=i;j--)
//				{
//					System.out.print(" ");
//				}
//				for(int k=1;k<=i;k++)
//				{
//					System.out.print("*");
//				}
//				System.out.println();
//			}
			
	
//		
//		for(int i=0;i<=5;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=5;k>=i;k--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		for(int i=1;i<=5;i++)
//		{															
//			for(int j=4;j>=i;j--)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++)
//			{
//				System.out.print(" *");
//			}
//			System.out.println();
//		}
		
		

//		for(int i=0;i<=5;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=5;k>=i;k--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		
		for(int i=1;i<=5;i++)
		{															
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
//		for(int i=0;i<=5;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=5;k>=i;k--)
//			{
//				System.out.print(" *");
//			}
//			System.out.println();
//		}
//			

//		
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=5;j>=i;j--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}


		
		
		
//		for (int i=0;i<6;i++)
//		{
//			for(int j=0;j<i+1;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int u=0;u<6;u++)
//		{
//			for(int nu=0;nu<u+1;nu++)
//			{
//				System.out.print("*");	
//			}
//			System.out.println();
//		}
//

//		int u,nu,mu=8;
//
//		for(u=0;u<5;u++)
//		{
//			for(nu=0;nu<mu;nu++)
//			{
//				System.out.print(" ");
//			}
//		mu=mu-2;
//			for(nu=0;nu<=u;nu++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		int i,j,n=5;
		

		for(i=1;i<=5;i++)
		{
			for(j=i-1;j>0;j--)
			{
				System.out.print(" ");
			}
			for(j=(n-i)*2+1;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println();

		
		}
	}

}
