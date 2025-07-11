package com.recursion;
import java.util.*;
public class Sum {
	public static int sum(int n) {
		if(n<=1) {
			return 1;
		}
		return n+sum(n-1);
	}
	public static int sum1(int n) {
		if(n==0) {
			return 0;
		}
		return (n%10)+sum1(n/10);
	}
	public static int prod(int n) {
		if(n%10==n) {
			return n;
		}
		return (n%10)*prod(n/10);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(prod(n));

	}

}

//Note : Same for fact mul div mul sub but base condition changes
