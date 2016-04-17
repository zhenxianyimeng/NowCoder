package com.nowcoder.pat.basic;

import java.util.Scanner;

public class B1019 {
	public static boolean isPlalindrome(int n, int index){
		boolean flag = false;
		int[] num = new int[32];
		int temp = n;
		if(temp == 1)
			flag = true;
		else{
			int j=0;
			while(temp >= 1){
				num[j] = (temp%index);
				temp = temp/index;
				j++;
			}
			int i;
			int len = j;
			for( i=0; i<len/2; i++)
				if(num[i] != num[len - 1 -i])
					break;
			if(i == len/2){
				flag = true;
				/*for(j=0; j<len; j++)
					System.out.print(num[j]);
				System.out.println(":"+index);*/
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int i;
			for(i=2; i<=16; i++)
				if(isPlalindrome(n, i)){
					System.out.println("Yes");
					break;
				}
			if(i == 17)
				System.out.println("No");
		}
	}
}	
