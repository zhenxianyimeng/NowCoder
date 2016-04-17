package com.nowcoder.pat.basic;

import java.util.Scanner;

public class B1028 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String A = sc.next();
			String B = sc.next();
			int[] arrA = new int[26];
			int[] arrB = new int[26];
			//sc.nextLine();
			for(int i=0; i<A.length(); i++)
				arrA[A.charAt(i) - 'A']++;
			for(int i=0; i<B.length(); i++)
				arrB[B.charAt(i) - 'A']++;
			boolean flag = true;
			for(int i=0; i<26; i++)
				if(arrA[i] - arrB[i] < 0){
					flag = false;
					break;
				}
			if(flag)
				System.out.println("Yes");
			else {
				System.out.println("No");
			}
			
		}
	}
}
