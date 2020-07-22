package pactice;

public class Method_overloadin {
	
	public static void add (int a, int b)
	{
		System.out.println("Method add : "+ (a + b));
	}

	public  static double add (double a, double b , double c)
	{
		System.out.println("Method overloading  :"+ (a + b + c));
		return a+b+c;
	}

	
	public static void main(String[] args) {
		
		add(22, 22);
		
		add(30, 33, 99);
	}

	public void disp() {
		// TODO Auto-generated method stub
		
	}
}
