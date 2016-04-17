package com.nowcoder.pat.basic;

import java.util.Scanner;

public class B1016 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int r = sc.nextInt();
			int total = 0;
			if (n == 1)
				System.out.println(n);
			else {
				while (n >= 1) {
					if(n%r == 1)
						total++;
					n = n/r;
				}
				System.out.println(total);
			}
		}
	}
}
