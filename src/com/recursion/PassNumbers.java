package com.recursion;
import java.util.*;
public class PassNumbers {
	public static void passnum(int n) {
		if(n==0) {
			return;
		}
		passnum(--n);
		System.out.println(n);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		passnum(n);

	}

}
