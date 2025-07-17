package com.java.basics.oop;


interface Printable{
	void print();
}
interface Showable{
	void show();
}

class Document implements Printable, Showable {

    public void print() {
        System.out.println("Printing document...");
    }
    @Override
    public void show() {
        System.out.println("Showing document...");
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
