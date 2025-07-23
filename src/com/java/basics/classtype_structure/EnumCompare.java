package com.java.basics.classtype_structure;

public class EnumCompare {

	enum Color {
		RED, BLUE, GREEN;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Color color1 = Color.RED;
		Color color2 = Color.RED;
		Color color3 = Color.BLUE;

		if (color1 == color2) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}

		if (color1 == color3) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}

		if (color1.equals(color2)) {
			System.out.println("color1 and color2 are the same");
		} else {
			System.out.println("color1 and color2 are different");
		}

		if (color1.equals(color3)) {
			System.out.println("color1 and color3 are the same");
		} else {
			System.out.println("color1 and color3 are different");
		}

	}

}
