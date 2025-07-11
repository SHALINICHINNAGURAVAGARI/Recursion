package com.recursion;
import java.util.*;
public class OneToN {
	public static void FirstNnumbers(int n) {
		if(n==5) {
			return;
		}
		System.out.println(n);
		FirstNnumbers(n+1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		FirstNnumbers(n);
	}

}
