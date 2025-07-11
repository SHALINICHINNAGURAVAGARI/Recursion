package com.recursion;
import java.util.*;
public class Message {
	//Printing message 5 times using recursion
	public static void Message1() {
		System.out.println("Hello Recursion!");//Prints
		Message2();//Calls the next function to print
	}
	public static void Message2() {
		System.out.println("Hello Recursion!");//Prints
		Message3();//Calls the next function to print
	}
	public static void Message3() {
		System.out.println("Hello Recursion!");//Prints
		Message4();//Calls the next function to print
	}
	public static void Message4() {
		System.out.println("Hello Recursion!");//Prints
		Message5();//Calls the next function to print
	}
	public static void Message5() {
		System.out.println("Hello Recursion");//Prints and reverts back the the function where it got invoked
	}
	public static void main(String[] args) {
		Message1();
	}

}
