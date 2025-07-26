package com.java.basics.collections;

import java.util.EnumMap;

public class EnumMapExample {

	enum Day{
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumMap<Day,String> activity = new EnumMap<>(Day.class);
		
		activity.put(Day.MONDAY, "Gym");
		activity.put(Day.TUESDAY, "Walk");
		activity.put(Day.WEDNESDAY, "legs");
		
		for(Day day : Day.values()) {
			System.out.println(day + " : " +activity.getOrDefault(day, "No Activity"));
		}

		

	}

}
