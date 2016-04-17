package com.nowcoder.pat.basic;

import java.math.BigInteger;
import java.util.Scanner;

public class B1025 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			BigInteger a = sc.nextBigInteger();
			BigInteger b = sc.nextBigInteger();
			BigInteger c = sc.nextBigInteger();
			if(a.add(b).compareTo(c)>0 && a.add(c).compareTo(b)>0 &&b.add(c).compareTo(a)>0)
				System.out.println("Yes");
			else
				System.out.println("No");
			
		}
	}
}
