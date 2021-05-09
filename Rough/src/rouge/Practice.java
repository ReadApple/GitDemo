package rouge;

import java.util.Scanner;

public class Practice
{
	public static void main(String[] args)
	{
		/*		int month_days[]=new int[12];
		month_days[0]=31;
		month_days[1]=28;
		month_days[2]=31;
		month_days[3]=30;
		month_days[4]=31;
		month_days[5]=30;
		month_days[6]=31;
		month_days[7]=31;
		month_days[8]=31;
		month_days[9]=30;
		month_days[10]=31;
		month_days[11]=30;



		//	System.out.println("The April month has "+month_days[3]+" days");


		//	int months_days []={31,28,31,30,31,30,31,31,30,31,30,31};


		//	System.out.println("The August month has "+months_days[7]+" days");


		double nums[]={10.1,11.2,12.3,13.4,14.5};
		double result=0;
		int i;

		for(i=0;i<5;i++)
		{
			result=result+nums[i];
		}

		//	System.out.println("Average is "+ result/5);




				int twod[][] =new int [4][];

		twod[0]=new int [1];
		twod[1]=new int [2];
		twod[2]=new int [3];
		twod[3]=new int [4];

		int j,k,l=0;

		for(j=0;j<4;j++)
		{
			for(k=0;k<j+1;k++)
			{
				twod[j][k]=l;
				l++;
				System.out.print(twod[j][k]+" ");
			}
			System.out.println();
		}	

		int x=5,y=3;

		double z=Math.sqrt(x*x-y*y);

		System.out.println("The value of z is : "+z);


		int v=42;
		double w=42.25;

		v%=10;

		System.out.println("The mod of v is : "+v);
		System.out.println("The mod of v is : "+w%10);

		int g,h;

		g=10;

		h=g<0?-g:g;

		System.out.println("Absolute value of ");
		System.out.println(g +" is "+h);

		g=-10;

		h=g<0?-g:g;

		System.out.println("Absolute value of ");
		System.out.println(g +" is "+h);

		int month=3;

		String season;

		switch (month) {

		case 12:
		case 1:	
		case 2:
			season="Winter";
			break;

		case 3:
		case 4:
		case 5:
			season="Spring";
			break;
		case 6:
		case 7:
		case 8:
			season="Summer";
			break;
		case 9:
		case 10:
		case 11:
			season="Autumn";
			break;
		default:
			season="Bogus month";
			break;
		}
		System.out.println("March is in the "+season+".");


		int q=100;
		int e=200;
		{
			while(++q < --e)
			{
				System.out.println("Midpoint is " + q);	
			}	
		}

		int n=10;

		do{
			System.out.println("tick "+n);
		}
		while(--n>0);


		int a,b;
		for(a=1,b=4;a<b;a++,b--)
		{
			System.out.println("a = "+a);
			System.out.println("b = "+b);
		}

		int s=0;

		boolean done=false;
		s=0;
		for(;!done;)
		{
			System.out.println("s is "+s);
			if(s==10)
				done=true;
			s++;
		}


		int num[]={1,2,3,4,5,6,7,8,9};
		int sum =0;

		for(int c:num)
		{
			System.out.println("Value is: "+c);
			sum +=c;
		}
		System.out.println("Summation: "+ sum);

		int sum=0;
	int num [][]=new int [3][5];

	for(int f=0;f<3;f++)
	{
		for(int d=0;d<5;d++)
		{
			num[f][d]=(f+1)*(d+1);
		}
		for(int r[]:num)
		{
			for(int t:r)
			{
				System.out.println("Value is : "+t);
				sum += t;
			}
		}
		System.out.println("Summation is : "+ sum);
	}

			int num[]={9,6,8,3,5,4,7,0};

	int val=5;

	boolean found =false;

	for(int r:num)
	{
		if(r==val)
		{
			found =true;
		break;
		}
	}

	if(found)
	{
		System.out.println("Value found!");
	}
	else
	{
		System.out.println("Value not found");
	}



				for(int u=0;u<6;u++)
		{
			for(int nu=0;nu<u+1;nu++)
			{
				System.out.print("*");	
			}
			System.out.println();
		}


		int u,nu,mu=8;

		for(u=0;u<5;u++)
		{
			for(nu=0;nu<mu;nu++)
			{
				System.out.print(" ");
			}
		mu=mu-2;
			for(nu=0;nu<=u;nu++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		 


		int i,j,n=5;
		System.out.println("hi");

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


//i=1 j=1
//i=2 j=3
//i=3 j=5
//i=n j=(2*i)-1
//
//i=1 j=3
//i=2 j=2
//i=3 j=1

		}

/*		int i,j,k=0,n=5;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int rows=sc.nextInt();
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=rows-i;j++)
			{
				System.out.print("  ");
			}
			while(k !=(2*i-1))
			{
				System.out.print("* ");
				k++;
			}
			k=0;
			System.out.println();
		}
		sc.close();*/
	
	/*boolean t=true;
	System.out.println("Before the return");
	
	//if (t) return;
	
	System.out.println("This is it");
	*/
		
//	int i,j,k;
//		for(i=1;i<=5;i++)
//		{
//			for(j=i;j<5;j++)
//			{
//				System.out.print(" ");
//			}
//			for(k=1;k<(i*2);k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(i=4;i>=1;i--)
//		{
//			for(j=5;j>i;j--)
//			{
//				System.out.print(" ");
//			}
//			for(k=1;k<(i*2);k++)
//			{
//				System.out.print("*");
//			}
//	       System.out.println();
//		}
	
	for(int i=1;i<=5;i++)
	{
		for(int j=i;j<5;j++)
		{
			System.out.print(" ");			
		}
		for(int k=1;k<(i*2);k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=4;i>=1;i--)
	{
		for(int j=5;j>i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<(i*2);k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	int i,j,n=5;
	System.out.println("hi");

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







