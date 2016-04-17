package com.nowcoder.pat.basic;

import java.util.Scanner;

public class B1021 {
	public static long errorqueue(int n){
		if(n==1)
			return 0;
		else if(n==2)
			return 1;
		else
			return (n-1)*(errorqueue(n-1)+errorqueue(n-2));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			long num = 1;
			for(int i=1; i<=n; i++){
				num *= i;
			}
			System.out.printf("%.2f%%\n",100.0*errorqueue(n)/num);
			//System.out.println("%");
		}
	}
}	
