package com.nowcoder.huawei;

import java.util.Scanner;

public class T001 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] strarr = str.split(" ");
		System.out.println(strarr[strarr.length-1].length());
	}
}
