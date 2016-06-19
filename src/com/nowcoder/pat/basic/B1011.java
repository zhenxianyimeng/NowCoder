package com.nowcoder.pat.basic;

import java.util.Scanner;

public class B1011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x==0 && y==0)
				break;
			int i;
			for(i=x; i<=y; i++){
				//System.out.println(i*i+i+41);
				if(!isPrime(i*i+i+41))
					break;
			}
			if(i==(y+1))
				System.out.println("OK");
			else
				System.out.println("Sorry");
		}
	}
	public static boolean isPrime(int num){
		boolean flag = true;
		for(int i=2; i<=Math.sqrt(num); i++){
			if(num % i == 0){
				flag = false;
				break;
			}
		}
		return flag;
	}
}
