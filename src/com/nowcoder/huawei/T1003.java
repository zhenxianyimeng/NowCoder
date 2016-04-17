package com.nowcoder.huawei;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class T1003 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
		Set<Integer> set = new TreeSet<>();
		int N = sc.nextInt();
		for(int i=0; i<N; i++){
			set.add(sc.nextInt());
		}
		for(Integer e:set)
			System.out.println(e);
		}
	}
}
