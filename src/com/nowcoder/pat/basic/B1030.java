package com.nowcoder.pat.basic;

import java.util.Scanner;

public class B1030 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str = sc.nextLine();
			char[] charr = str.toCharArray();
			for(int i=0; i<str.length(); i++){
				if(charr[i] >= 'F' && charr[i] <= 'Z')
					System.out.print((char)(charr[i]-5));
				else if(charr[i] >= 'A' && charr[i] <= 'E')
					System.out.print((char)(charr[i]-5+26));
				else {
					System.out.print(charr[i]);
				}
			}
			System.out.println();
		}
	}
}
