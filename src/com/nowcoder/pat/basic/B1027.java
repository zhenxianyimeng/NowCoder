package com.nowcoder.pat.basic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class B1027 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int m = sc.nextInt();
			int n = sc.nextInt();
			DecimalFormat df = new DecimalFormat("#.00");
			if(m%2 == 0 || n%2 == 0)
				System.out.println(m*n);
			else
				System.out.println(df.format(m*n-1+Math.sqrt(2)));
		}
	}
}
