package com.nowcoder.pat.basic;

import java.util.Scanner;

public class B1031 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str = sc.nextLine();
			int[] flag = new int[10];
			char[] ch = str.toCharArray();
			for(int i=0; i<str.length(); i++){
				flag[ch[i] - '0']++;
			}
			
			int max = 0;
			for(int i=0; i<10; i++)
				if(flag[i] > max)
					max = flag[i];
			for(int i=max; i>=1; i--){
				for(int j=0; j<10; j++){
					if(flag[j] == i){
						System.out.print("*");
						flag[j]--;
					}
					else
						System.out.print(" ");
				}
				System.out.println();
			}
			System.out.println("0123456789");
		}
	}
}
