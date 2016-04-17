package com.nowcoder.company.wy;

import java.util.Scanner;

public class B001 {
	public static int BigNum(int a,int b){
		int num = 1;
		int min = a>b ? b:a;
		for(int i=1; i<=min; i++){
			if(b%i==0 && a%i==0)
				num = i;
		}
			
		return num;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int a = sc.nextInt();
			for(int i=0; i<n; i++){
				int b = sc.nextInt();
				if(b <= a)
					a += b;
				else{
					a += BigNum(a, b);
				}
			}
			System.out.println(a);
		}
	
	}
}
