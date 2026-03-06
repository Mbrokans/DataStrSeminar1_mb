package service;

import datastr.MyArrayList;
import model.student;

public class mainservice {
	public static void main(String[] args) throws Exception {
		MyArrayList<Character> symbols = new MyArrayList<Character>(2);
		symbols.add('a');//a
		symbols.add('b');//a b
		symbols.add('c');//a b c (automatiski bus resize izpildijies)
		try {
			symbols.print();//a b c
			symbols.add('Z',1);// a Z b c
			symbols.print();
			symbols.remove(2);// izdzest b
			symbols.print();
			System.out.println(symbols.get(1));
			
			System.out.println(symbols.search('c')); // 2. pozicija
			System.out.println(symbols.getNextElement('a'));// Z
			symbols.sort();
			symbols.print();
			
			symbols.MakeEmpty();// viss tiek dzests
			symbols.add('W');
			symbols.print();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		MyArrayList<student> allStudents = new MyArrayList<student>();
		allStudents.add(new student("Mairis","Gleznis" ));
		allStudents.add(new student("Grubis","Maisins" ));
		allStudents.add(new student("Adriana","Slavena" ));
		allStudents.add(new student("Maira", "Upe"), 1);
		allStudents.print();
		System.out.println(allStudents.get(3));
		allStudents.remove(3);
		allStudents.print();
		
		
		
	}
}
