package rouge;

class Address 
{
	String city,country,zip;
	
	public Address(String city,String country,String zip)
	{
		this.city=city;
		this.country=country;
		this.zip=zip;
	}
}

 public class Employee{
	 int id;
	 String name;
	 Address address;
	 
	 public Employee(int id,String name,Address address)
	 {
		 this.id=id;
		 this.name=name;
		 this.address=address;
	 }

	 void display()
	 {
		 System.out.println(id+" "+name);
		 System.out.print(address.city+" "+address.country+" "+address.zip);
	 }
	 
	 public static void main(String[] args) 
	 {
		 Address address1=new Address("New Delhi","India","ABC123");
		 Address address2=new Address("Berlin","Germany","XYZ987");
		 
		 Employee e1=new Employee(111,"Varun",address1);
		 Employee e2=new Employee(222,"Batra",address2);
	 
		 e1.display();
		 e2.display();
	 }
	
	
}
