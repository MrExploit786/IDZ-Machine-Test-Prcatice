package pactice;

public class Caonstructor_Overloading_Main {
	
	
	public static void main(String[] args) {
		
		Constructor_overloading_StudentData cos = new Constructor_overloading_StudentData();

		System.out.println("sid :" + cos.getSid() );
		System.out.println("sname :" + cos.getSname());
		System.out.println("salary :" + cos.getSalary());

		
		System.out.println("***********************************************");
		
		
		Constructor_overloading_StudentData obj2 = new Constructor_overloading_StudentData(20,"Raj",80000);
		
		

		System.out.println("sid :" + obj2.getSid() );
		System.out.println("sname :" + obj2.getSname());
		System.out.println("salary :" + obj2.getSalary());
		
		
	}
	
	

}
