package rouge;

import java.util.ArrayList;

public class Practice3 {
	enum Season{
		Winter(10),Spring(15),Autumn(20);
		
		private int value;
		private Season (int values)
		{
			this.value=values;
		}
	}
	
	public static void main(String[] args) 
	{
		for(Season s:Season.values())
		{
			System.out.println(s+" "+s.value);
		}
		
		
		
		
		
	/*	ArrayList<String>list=new ArrayList<String>();
		list.add("vimal");
		list.add("jonker");
		list.add("duminy");
		
		for(String s:list)
		{
			System.out.println(s);
		}

*/	}

}
