package random;

public class Practice2 
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("The Length Is Good");
		char ch[]=new char[sb.length()];
		
		for(int i=0;i<sb.length();i++)
		{
			ch[i]=sb.charAt(i);
		}
		
		for(int i=sb.length()-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}
}

