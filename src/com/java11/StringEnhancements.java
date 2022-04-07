package com.java11;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringEnhancements {

	public static void main(String[] args) {

		//lines() method
		String a="abd \n"
				+"jsakjfoa \n"
				+"oiuwo \n";
		//a.lines().forEach(System.out::println);
		Stream<String> lines = a.lines();
		List<String> collect = lines.collect(Collectors.toList());
		System.out.println(collect);
		
		//isBlank()
		String s="";
		String s1="sjfla";
		System.out.println(s.isBlank());
		System.out.println(s1.isBlank());
		
		//strip front and back spaces removed
		String o="    adada       ";
		System.out.println(o.strip());
		//stripLeading() --front spaces removed
		System.out.println(o.stripLeading());
		//stripTrailing() --back spaces removed
		System.out.println(o.stripTrailing());
		
		//repeat --we use for loop 10 times but in repeat not required 
		String p="welcome  ";
		System.out.println(p.repeat(10));
		

	}

}
