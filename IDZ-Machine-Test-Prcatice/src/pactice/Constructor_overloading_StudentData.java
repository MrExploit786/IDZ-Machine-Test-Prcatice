package pactice;

public class Constructor_overloading_StudentData {

	private int sid;
	private String sname;
	private int salary;
	
	
	public Constructor_overloading_StudentData() {
		
		sid=1;
		sname="yogesh";
		salary=50000;
				
	}
	
	
	public Constructor_overloading_StudentData(int sid, String sname, int salary) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.salary = salary;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
