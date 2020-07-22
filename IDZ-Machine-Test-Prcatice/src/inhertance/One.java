package inhertance;


// Multiple Inheritance 

public interface One {
    public void print_geek(); 

    
}

interface two 
{ 
    public void print_for(); 
} 

interface three extends One,two 
{ 
    public void print_geek(); 
} 


class child implements three {

	@Override
	public void print_for() {
		// TODO Auto-generated method stub
        System.out.println("For"); 

	}

	@Override
	public void print_geek() {
		// TODO Auto-generated method stub
        System.out.println("Geeks"); 

	}
	
	public static void main(String[] args) {
		
		child ch =new child();
		
		ch.print_for();
		ch.print_geek();
	}
	
	
}
