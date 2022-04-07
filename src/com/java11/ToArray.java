package com.java11;

import java.util.ArrayList;
import java.util.Arrays;

public class ToArray {

	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<>();
		list.add("abc");
		list.add("xyz");
		//java 8
		String[] array = list.stream().toArray(s -> new String[s]);
		System.out.println(Arrays.toString(array));
		//java 11
		String[] array2 = list.toArray(s -> new String[s]);
		System.out.println(Arrays.toString(array2));
		//or method reference
		String[] array3 = list.toArray(String[]::new);
		System.out.println(Arrays.toString(array3));
		
	}
}
