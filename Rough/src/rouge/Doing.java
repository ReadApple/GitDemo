package rouge;

public interface Doing 
{
	public void draw();
}

class Rectangle implements Doing{

	@Override
	public void draw() 
	{
		System.out.println("The rectangle is big GIT B ");

	}

}

class Circle implements Doing{

	@Override
	public void draw()
	{
		System.out.println("The circle is big GIT B ");
	}
}

class Figure{
	
	public static void main(String[] args)
	{	
			Rectangle rct=new Rectangle();
			rct.draw();

	}
	public void display(int a,int b){
	System.out.println("Display GIT B ");
	}
	public void display(int a,int b, int c){
	System.out.println("Displaying GIT B ");	
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
