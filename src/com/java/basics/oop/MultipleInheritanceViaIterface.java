package com.java.basics.oop;


interface Printable{
	void print();
}
interface Showable{
	void show();
}

class Document implements Printable, Showable {

	@Override
	public void show() {
		// TODO Auto-generated method stub
        System.out.println("Showing document...");

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
        System.out.println("Printing document...");

	}


}
public class MultipleInheritanceViaIterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document doc = new Document();
		doc.print();
		doc.show();

	}

}
