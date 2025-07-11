package com.recursion;
import java.util.*;
public class Fibonacci {
	public static int fibo(int n) {
		if(n<2) {
			return n;
		}
		return fibo(n-1)+fibo(n-2);
		//this extra of stepping of adding and then returning is not the tail recursion
	}
	public static void printFibo(int n) {//helper method
		for(int i=0;i<n;i++) {
			System.out.print(fibo(i)+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//when you have last statement in the function call then it is called tail recursion
		printFibo(n);
		}

	}
