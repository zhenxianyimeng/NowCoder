package com.nowcoder.pat.basic;

import java.util.Scanner;

public class B1017 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int total = sc.nextInt();
			int r = sc.nextInt();
			
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
