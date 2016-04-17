package com.nowcoder.huawei;

import java.util.Scanner;

public class T002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		char chflag = sc.next().charAt(0);
		int num = 0;
		for(int i=0; i<string.length(); i++){
			char ch = string.charAt(i);
			if((chflag >= 'a' && chflag <= 'z')||(chflag >= 'A' && chflag <= 'Z')){
				if((ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z'))
					if(Math.abs(ch-chflag) == 32 || ch == chflag)
						num ++;
			}
			else
				if(ch == chflag)
					num ++;		
		}
		System.out.println(num);
	}
}
