package pactice;

public class prime {

	
	public  static void isPrime(int num) {
		
		if (num / 2 == 0) {
			System.out.println("Number is not Prime  ");
		}
		
		else {
			System.out.println("Number is prime");
		}
	}
	
	public static void main(String[] args) {
	
		isPrime(8);
	}
	
}
