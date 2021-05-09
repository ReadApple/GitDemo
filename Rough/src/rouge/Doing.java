package rouge;

public interface Doing 
{
	public void draw();
}

class Rectangle implements Doing{

	@Override
	public void draw() 
	{
		System.out.println("The rectangle is big");

	}

}

class Circle implements Doing{

	@Override
	public void draw()
	{
		System.out.println("The circle is big");
	}
}

class Figure{
	
	public static void main(String[] args)
	{	
			Rectangle rct=new Rectangle();
			rct.draw();

	}
	public void display(int a,int b){
	System.out.println("Display");
	}
	public void display(int a,int b, int c){
	System.out.println("Displating");	
	}
	
	
	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a, int b,int c)
	{
		return a+b+c;
	}
	
}
