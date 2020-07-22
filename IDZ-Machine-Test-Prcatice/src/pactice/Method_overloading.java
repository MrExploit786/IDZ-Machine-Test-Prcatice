package pactice;

public class Method_overloading {

	
	public int add(int a, int b) {
		
		return a+b;
	}
	
	
	public double add(double a , double b,int c) {
		
		return a+b+c; 
	}
	
	public static void main (String arg []) {
		
		Method_overloading mo = new Method_overloading();
		System.out.println("Adding 1: "+mo.add(20, 30));
		System.out.println("Adding 2: "+mo.add(20, 30,80));

	}
}
