package com.nowcoder.pat.basic;

import java.util.Scanner;

public class B1024 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int total = 1;
			if(n == 0)
				break;
			while(n >1){
				total = (total + 1)*2;
				n--;
			}
			System.out.println(total);
		}
	}
}
