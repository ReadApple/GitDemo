package rouge;

public class Snippet {
	
	public static void printNumber(int num)
	{
		System.out.println(num);
		num++;
		if(num<=100)
		{
			printNumber(num);
		}
	}
	
	public static void main(String[] args)
	{
		int num=1;
		printNumber(num);
	}
}

