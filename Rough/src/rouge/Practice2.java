package rouge;

import java.util.regex.Pattern;

public class Practice2 {

//	enum Season
//	{
//		Winter(5),Spring(10),Summer(15),Fall(20);
//		
//		private int value;
//		private Season(int value)
//		{
//			this.value=value;
//		}
//	
//	}	
	public static void main(String[] args)
      {
//		for(Season s : Season.values())
//		{
//			System.out.println(s+" "+s.value);
//		}
//		
		
	/*	String rev="";
		int len=s.length();

		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse of the string : "+""+rev);


		*/
		
//		String s="Have a good day";
//		String rev="";
//		int len=s.length();
//		
//		for(int i=len-1;i>=0;i--)
//		{
//			rev=rev+s.charAt(i);
//		}
//		System.out.println("Reverse of the string : "+""+rev);

		String s="Have a good day";
		
		Pattern pattern=Pattern.compile("\\s");
		
		String[] temp= pattern.split(s);
		String result="";
		
		for(int i=0;i<temp.length;i++)
		{
			if(i==temp.length-1)
			{
				result=temp[i]+result;
			}
			else{
				result=" "+temp[i]+result;
			}
		}
		
		System.out.println("The result is : "+result);
		
	 }
	
}
