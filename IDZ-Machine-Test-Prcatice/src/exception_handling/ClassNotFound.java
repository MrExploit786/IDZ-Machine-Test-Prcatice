package exception_handling;

public class ClassNotFound {
	

	private static String name = "hello";
	

	public static void main(String[] args) {
		
		
		try {
			Class Loadclass = Class.forName(name);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

}

}
