package com.nowcoder.pat.basic;

import java.util.Scanner;

public class B1018 {
	public static int totalnum(int n, int r){
		int total = 0;
		if(n == 1)
			total = 1;
		else{
			while(n >= 1){
				total += n%r;
				n = n/r;
			}
		}
		return total;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int r = sc.nextInt();
			int total = totalnum(n, r);
			//System.out.println(total);
			int index = 0;
			int[] num = new int[32];
			if(total == 1)
				System.out.println(total);
			else{
				while(total >=1 ){
					num[index] = total % r;
					total = total /r;
					index++;
				}
				for(int i=index-1; i>=0; i--){
					if(num[i] < 10)
						System.out.print(num[i]);
					else
						System.out.printf("%c",'A'+ num[i] - 10);
				}
				System.out.println();
			}
		}
	}
}
