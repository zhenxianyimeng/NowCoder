package com.nowcoder.pat.basic;

import java.util.Scanner;

public class B1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			String str = a/b + ".";
			while(n>0){
				int r = (10*a);
				str +=	r/b;
				a = r%b;
				n--;
			}
			System.out.println(str);
		}
	}
}
