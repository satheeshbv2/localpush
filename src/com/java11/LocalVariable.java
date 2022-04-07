package com.java11;

public class LocalVariable {

	public static void main(String[] args)
	{
		//var is applicable for local variables only
		var userId=234534;
		System.out.println(userId);
		FunctionInter f=(var a,var b) -> a+b;
	}
}

interface FunctionInter
{
	public int operator(int a, int b);
}
