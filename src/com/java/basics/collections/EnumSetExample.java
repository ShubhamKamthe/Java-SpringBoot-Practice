package com.java.basics.collections;

import java.util.EnumSet;

public class EnumSetExample {
	
	
	enum Days{
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EnumSet<Days> week = EnumSet.of(Days.SATURDAY, Days.SUNDAY);
		System.out.println("Weekend" +week);
		
		EnumSet<Days> workweek = EnumSet.range(Days.MONDAY, Days.FRIDAY);
		System.out.println("Workweek" +workweek);
		
		EnumSet<Days> allDays = EnumSet.allOf(Days.class);
		System.out.println("All Days" +allDays);




	}

}
