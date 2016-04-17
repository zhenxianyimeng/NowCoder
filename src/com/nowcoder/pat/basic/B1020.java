package com.nowcoder.pat.basic;

import java.util.Scanner;

public class B1020 {
	public static long errorqueue(int n){
		if(n==1)
			return 0;
		else if(n==2)
			return 1;
		else
			return (n-1)*(errorqueue(n-1)+errorqueue(n-2));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			System.out.println(errorqueue(sc.nextInt()));
		}
	}
}
