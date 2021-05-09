package rouge;

import java.util.regex.Pattern;

public class ReverseJava {

	public static void main(String[] args) {
		String str="I love Java Programming";
//		
//		Pattern pattern=Pattern.compile("\\s");
//		String[] temp=pattern.split(str);
//		String result="";
//		
//		for(int i=0;i<temp.length;i++)
//		{
//			if(i==temp.length-1)
//			{
//				result=temp[i]+result;
//			}
//			else{
//			result=" "+temp[i]+result;
//			}
//		}
//		
//		System.out.println(result);
//		
		
		
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		
		System.out.println(reverse);
		
		
		
		
		
		
		
		
		
		
//		Pattern pattern=Pattern.compile("\\s");
//		
//		String[] temp=pattern.split(str);
//		String result="";
//		
//		for(int i=0;i<temp.length;i++)
//		{
//			if(i==temp.length-1)
//			{
//				result=temp[i]+result;
//			}
//			else
//			{
//				result=" "+temp[i]+result;
//			}
//		}
//		System.out.print(result);
//		String revers="";	
//		
//		for(int i=str.length()-1;i>=0;i--)
//		{
//			revers=revers+str.charAt(i);
//		}
//		System.out.println(revers);
		
	
	
	}
	
	
	

}
