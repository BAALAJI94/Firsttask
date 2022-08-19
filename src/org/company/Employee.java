package org.company;

public class Employee {
	public void add(String name,int age, float id) {
		System.out.println("Employee:"+name+age+id);
	}
	public void add(String name,float id, int age) {
		System.out.println("Employee:"+name+age+id);
	}
	public static void main(String[]args) {
		Employee e=new Employee();
		e.add("BAALAJI",123456f,29);
		e.add("SIVA", 26, 12365f);
		
	}
}
