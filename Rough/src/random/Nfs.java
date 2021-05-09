package random;

import java.util.ArrayList;
import java.util.Iterator;

interface Shape{
	public void draw();
}

public class Nfs 
{

	public static void main(String[] args) 
	{
		int width=10;
		
//		Shape d=new Shape()
//		{
//			@Override
//			public void draw()
//			{
//				System.out.println("Drawing "+width);
//			}
//		};
//		d.draw();
//	}

		Shape s2=()->{
			System.out.println("Drawing "+width);
		};
		s2.draw();	
	}

}
































////{
////public static void main(String[] args) {
////ArrayList<String>list=new ArrayList<String>();
////list.add("ayush");
////list.add("Anirudh");
////list.add("Kumar");
////list.add("mathur");
////
////Iterator itr=list.iterator();
////
////while(itr.hasNext())
////{
////	System.out.println(itr.next());
////}
//		
//	public static void main(String[] args) 
//	{
//		String text="country";
//		String [] result=text.split("");
//		String original="";
//		
//		for(int i=result.length-1;i>=0;i--)
//		{
//			System.out.print((result[i]));
//		}
//		
//	}
//	