package com.recursion;
import java.util.*;
public class BinarySearch {
	public static int BS(int[]arr,int target,int s,int e) {
		if(s>e) {
			return -1;
		}
		int m=s+(e-s)/2;
		if(arr[m]==target) {
			return m;
		}else if(target<arr[m]) {
			return BS(arr,target,s,m-1);
		}
		return BS(arr,target,m+1,e);
	}
	public static int BS(int[]arr,int target) {
		return BS(arr,target,0,arr.length-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		System.out.println(BS(arr,target,0,arr.length-1));
	}
}
