package com.nowcoder.pat.basic;

import java.util.Scanner;

public class B1013 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int N = sc.nextInt();
			int i =2;
			boolean firstflag = true;
			while(i <= Math.sqrt(N)){
				while(N%i == 0){
					if(firstflag){
						System.out.print(N + " = "+i);
						firstflag = false;
					}else{
						System.out.print(" * "+i);
					}
					N = N/i;
				}
				i++;
			}
			if(firstflag)
				System.out.println(N + " = "+N);
			else if(N != 1)
				System.out.println(" * " + N);
			else {
				System.out.println();
			}
		}
	}
}
