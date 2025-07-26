package com.java.basics.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>(Arrays.asList("a","b","c"));
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().equals("b")){
				list.remove("b");	//adding or removing will not cause exception in case of concurrent 
			}
		}
		System.out.println("List : "+list);

	}

}
