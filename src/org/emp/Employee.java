package org.emp;

public class Employee {

	public void empID() {
System.out.println("empID:206");
	}
	public void empName() {
System.out.println("empName:Ravi");
	}
	public void empDob() {
System.out.println("empDob:29.8.1991");
	}
	public void empPhone() {
System.out.println("empPhone:9624368175");
	}
	public void empEmail() {
System.out.println("empEmail:ravi@gmail.com");
	}
	public void empAddress() {
System.out.println("empAddress:D/no.756,KK nagar,Chennai");
	}
	public static void main(String[] args) {
		Employee m = new Employee ();
		m.empID();
		m.empName();
		m.empPhone();
		m.empDob();
		m.empAddress();
		m.empEmail();
	}
}
