package pactice;

public class Employees {

private int id; 
private  String name ; 
private  int salary; 


public  Employees(){
} // default constructor  public  // no return type 


public void setId(int id) {
this.id=id;
}

public int getId(){
return id; 
}

public void setName(String name) {
this.name=name;
}

public String getName(){
return name; 
}

public void setSalary(int salary) {
this.salary=salary;
}

public int getSalary(){
return salary; 
}

public static void main (String arg []){

// creating object now 

Employees em = new Employees ();

em.setId(1);
em.setName("Yogesh");
em.setSalary(50000);

System.out.println("id :"+ em.getId());
System.out.println("Name :"+ em.getName());
System.out.println("Salary :"+ em.getSalary());

} 


}