package com.nowcoder.pat.basic;

import java.util.Scanner;

public class B1022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0){
				sc.close();
				break;
			}
			int num = 0;
			int left = n;
			int temp = 0;
			while(left >2){
				num++;
				temp = left/3;
				if(temp*3 == left-2)
					left = temp+1;
				else
					left = left - temp*2;
			}
			if(left == 2)
				num++;
			System.out.println(num);
		}
	}
}
