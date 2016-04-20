package com.nowcoder.pat.basic;

import java.util.Scanner;

public class B1015 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str = sc.nextLine();
			char[] ch = str.toCharArray();
			int sum = 0;
			for(int i=ch.length; i>0; i--){
				sum += (ch[ch.length-i] - '0')*(Math.pow(2, i)-1);
				//System.out.println(sum);
			}
			System.out.println(sum);
		}
	}
}
