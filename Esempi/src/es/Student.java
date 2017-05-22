package es;

public class Student extends People {

	private String corso;
	
	//Costruttore importante server per richiamre la super classe
	public Student(String name, String surname) {
		super(name, surname);
	}
	
	public void setCorso(String corso){
		this.corso = corso;
	}

	public String getCorso() {
		// TODO Auto-generated method stub
		return corso;
	}
	
	public String getName(){
		System.out.print("Student\t");
		return super.getName();
	}

}
