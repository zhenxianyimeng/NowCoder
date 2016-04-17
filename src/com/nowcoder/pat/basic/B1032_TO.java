package com.nowcoder.pat.basic;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class B1032_TO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10000];
		while(sc.hasNext()){
			int N = sc.nextInt();
			int M = sc.nextInt();
			for(int i=0; i<N; i++){
				arr[i] = 1;
			}
			int count = N;
			int num = 0;
			while(count > 1){
				for(int i=0; i<N; i++){
					if(arr[i] == 1){
						num++;
					    if(num%M == 0){
					    	arr[i] = 0;
					    	count--;
					    }
					}
				}
			}
			for(int i=0; i<N; i++)
				if(arr[i] == 1){
					System.out.println((i+1));
					break;
				}
		}
	
	}
}
