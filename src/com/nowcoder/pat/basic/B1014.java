package com.nowcoder.pat.basic;

import java.util.Scanner;

public class B1014 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int N = sc.nextInt();
			int num = 0;
			int d = (int)Math.sqrt(N)+1;
			int i=0;
			for(i=2; i<=d; i++){
				if(N%i == 0){
					num++;
					N=N/i;
				}
				while(N%i == 0){
					//num++;
					N=N/i;
				}
				if(N==1)
					break;
			}
			if(i-1 == d && N!= 1)
				num++;
			System.out.println(num);
		}
	}
}
