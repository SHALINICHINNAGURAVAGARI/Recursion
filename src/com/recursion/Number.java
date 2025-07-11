package com.recursion;
import java.util.*;
public class Number {
	//Printing numbers : 1 2 3 4 5
	public static void Number1(int n) {
		System.out.println(n);
		Number2(2);
	}
	public static void Number2(int n) {
		System.out.println(n);
		Number3(3);
	}
	public static void Number3(int n) {
		System.out.println(n);
		Number4(4);
	}
	public static void Number4(int n) {
		System.out.println(n);
		Number5(5);
	}
	public static void Number5(int n) {
		System.out.println(n);
	}
	public static void main(String[] args) {
		Number1(1);

	}

}
