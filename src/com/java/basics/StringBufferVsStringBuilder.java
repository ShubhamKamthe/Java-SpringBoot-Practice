package com.java.basics;

public class StringBufferVsStringBuilder {

	 public static void main(String[] args) {
		 
		 StringBuffer strobj = new StringBuffer("Buffer");   // length = 16(default) + length of your string
		 strobj.append("Example");
		 strobj.insert(0,"String");
		 System.out.println("String Length: "+strobj.capacity());
		 System.out.println(strobj.toString());
		 
		 StringBuilder strobj2 = new StringBuilder("Builder");   // length = 16(default) + length of your string
		 strobj2.append("Example");
		 strobj2.insert(0,"String");
		 System.out.println("String Length: "+strobj2.capacity());
		 System.out.println(strobj2.toString());
		 
		 
		 ////////////////////////////////////////////////////////////
	        // String Example
	        String str = "Hello";
	        System.out.println("Original String: " + str);

	        // Concatenating a new string to the original string
	        str = str + " World";
	        System.out.println("Modified String (using String): " + str);

	        // StringBuffer Example
	        StringBuffer stringBuffer = new StringBuffer("Hello");
	        System.out.println("Original StringBuffer: " + stringBuffer);

	        // Appending a new string to the original StringBuffer
	        stringBuffer.append(" World");
	        System.out.println("Modified StringBuffer: " + stringBuffer);

	        // StringBuilder Example
	        StringBuilder stringBuilder = new StringBuilder("Hello");
	        System.out.println("Original StringBuilder: " + stringBuilder);

	        // Appending a new string to the original StringBuilder
	        stringBuilder.append(" World");
	        System.out.println("Modified StringBuilder: " + stringBuilder);
	    }

}
