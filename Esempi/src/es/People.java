package es;

public class People {
	
	private String name;
	private String surname;
	private String prova;
	public People(String name, String surname){
	this.name = name;
	this.surname = surname;
	this.prova="prova";
	}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public Object getSurname() {
		// TODO Auto-generated method stub
		return surname;
	}
	public String getProva() {
		return prova;
	}
	public void setProva(String prova) {
		this.prova = prova;
	}
	
	
}
