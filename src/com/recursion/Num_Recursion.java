package com.recursion;
import java.util.*;
public class Num_Recursion {
	public static void print(int n,int m) {
		if(n==m) {//break point
			System.out.println(m);
			return;
		}
		//If no break point memory exceeds and Stack Over Flow error appears.
		System.out.println(n);//prints the number
		print(n+1,m);//call the same function again and again till the break point
		//when you have last statement in the function call then it is called tail recursion
		//You can treat it as a separate memory call in the stack
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		print(n,m);
	}

}
