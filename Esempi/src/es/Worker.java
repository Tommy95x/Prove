package es;

public class Worker extends People {

	public Worker(String name, String surname) {
		super(name, surname);
	}
	
	public String getName(){
		System.out.print("Worker\t");
		return super.getName();
	}
}
