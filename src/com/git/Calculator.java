package com.git;

public class Calculator {
		
		public static void add(int a, int b)
		{
			System.out.println(a+b);
		}
		public static void sub(int a, int b)
		{
			System.out.println(a-b);
		}
		public static void mul(int a, int b)
		{
			System.out.println(a*b);
		}
		public static void div(int a, int b)
		{
			System.out.println(a/b);
		}
		
		public static void main(String[] args) {
			add(10,5);
			sub(20,10);
			mul(5, 2);
			div(10, 2);
		}

	}


