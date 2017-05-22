package es;

import java.util.Scanner;

import prova.MadeClass;

public class Main{

	public static void main(String[] args) {
		People p = new People("Giovanni", "Rossi");
		People w = new Worker("Antonio", "Anselmi");
		Student s = new Student("Tommaso", "Grilli");
		Worker solo = new Worker("Giorgio", "Vigo");
		System.out.println(s.getName()+" "+s.getSurname());
		System.out.println(w.getName()+" "+w.getSurname());
		System.out.println(p.getName()+" "+p.getSurname());
		p=s;
		System.out.println(p.getName()+" "+p.getSurname());
		w=solo;
		System.out.println(w.getName()+" "+w.getSurname());
	}

}
