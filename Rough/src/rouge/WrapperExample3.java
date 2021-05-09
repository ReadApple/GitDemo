package rouge;

public class WrapperExample3 
{
	
	int data=50;
	void change(int data)
	{
		data=data+100;
	}
	
	public static void main(String[] args) {
		
		WrapperExample3 w=new WrapperExample3();
		
		System.out.println("before Changes"+w.data);
		w.change(500);
		System.out.println("after Changes"+w.data);
		
//		byte b=10;
//		int t=23;
//		
//		
//		Integer intobj=t;
//		Byte byteobj=b;
//		
//		System.out.println("The t is :"+intobj);
//		System.out.println("The b is :"+byteobj);
//		
//		byte bytevalue=byteobj;
//		int intvalue=intobj;
//		
//		System.out.println("The intvalue is  :"+intvalue);
//		System.out.println("The bytevalue is :"+bytevalue);


	
	
	
	}
}
