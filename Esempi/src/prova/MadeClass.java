package prova;

public class MadeClass implements InterfaceClass{

	private String programName;
	
	public void stamp(){
		System.out.println("Prova d'interfaccia");
	}
	public String getObject(){
		
		return programName;
	}
	public void setObject(String string){
		programName = string;
	}
	public void stampa() {
	}
}
