package com.nowcoder.pat.basic;

import java.math.BigInteger;
import java.util.Scanner;

public class B1023 {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		while(sc.hasNext()){
			BigInteger[] f = new BigInteger[21];
			f[1] = BigInteger.valueOf(0);
			f[2] = BigInteger.valueOf(1);
			int n = sc.nextInt();
			int m = sc.nextInt();
			BigInteger total = BigInteger.valueOf(1);
			for(int i=n; i>=n-m+1; i--)
				total = total.multiply(BigInteger.valueOf(i));
			for(int i=1; i<=m; i++)
				total = total.divide(BigInteger.valueOf(i));
			for(int i=3; i<=m ;i++){
				f[i] = (f[i-2].add(f[i-1]));
				f[i] = f[i].multiply(BigInteger.valueOf(i-1));
			}
				//f[i] = (i-1)*(f[i-2]+f[i-1]);
			total = total.multiply((f[m]));
			System.out.println(total.toString());
		}
	}
}
