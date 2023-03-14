package org.emp;

public class Employe {
	public void empId() {
System.out.println("Employee Id: 3627");
	} 
	public void empId(String name) {
		System.out.println(name);
	}
	public void empId(String name, int age) {
		System.out.println(name);
		System.out.println(age);
	}
	public void empId(String name, int age, char gender) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
	}
	public void empId(String name, int age, char gender, long phno) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(phno);
	
	}
	public static void main(String[] args) {
		Employe x = new Employe ();
		x.empId();
		x.empId("kamal");
		x.empId("kamal", 28);
		x.empId("Kamal", 28, 'm');
		x.empId("kamal", 28, 'm', 9025813674l);
	}

}
