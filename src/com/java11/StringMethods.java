package com.java11;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="sTringWorld welcomes you";
		String s1="qTringWorld";
		String s2="QTringWorld";
		String s3="sTringWorld welcomes you";
		long i=423423798;
		
		StringBuffer b=new StringBuffer("sTringWorld");
	    System.out.println(s.charAt(10));//starts from 0 index
		System.out.println(s.codePointAt(1));//returns the unicode value ex: A=65 --starts form 0 index
		System.out.println(s.length());//starts from 1 index
		System.out.println(s.codePointBefore(1));//before char it returns if 0 means error
		System.out.println(s.codePointCount(1,11));
		System.out.println(s1.compareTo(s));//
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s.concat("IsFuture"));//attached previous string op== sTringWorldIsFuture
		System.out.println(s.contains("z"));//checks specific character is available or not return ==>true or false
		System.out.println(s.contentEquals(b));//content checking in stringBuffer and string
		System.out.println(s.contentEquals("sTringWorld"));
		System.out.println(s.endsWith("d"));
		System.out.println(s.equals("sTringWorld"));
		System.out.println(s.equalsIgnoreCase("STRINGwORLD"));
		System.out.println(s.hashCode());
		System.out.println(s.indexOf('W'));
		//System.out.println(s.indexOf(6));
		System.out.println(s.indexOf("you", 1));//returns the index of is substring after 4th index
		//isEmpty(), isBlank()
		System.out.println(s.isEmpty());
		System.out.println(s.isBlank());//java 11
		System.out.println(s.lastIndexOf("u"));
		System.out.println(s.lastIndexOf("you",50));//50 starts from starting index position it will check 1 to 50 indexes it will present or not if not returns -1
		System.out.println(s.matches(s3));
		
		
		 
	}
	

}
