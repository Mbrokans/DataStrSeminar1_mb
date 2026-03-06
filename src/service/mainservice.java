package service;

import datastr.MyArrayList;

public class mainservice {
	public static void main(String[] args) {
		MyArrayList symbols = new MyArrayList(2);
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
		
		
	}
}
