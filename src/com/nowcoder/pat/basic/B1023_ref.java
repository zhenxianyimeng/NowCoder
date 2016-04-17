package com.nowcoder.pat.basic;

import java.util.Scanner;
 
public class B1023_ref {
     
    public static void main(String[] args) {
        //2¡Üm¡Ün¡Ü20
        long[] arr = new long[21];
        long[] factorialArr = new long[21];
        arr[2] = 1;
        arr[3] = 2;
        factorialArr[2] =2;
        factorialArr[3] = 6;
        for (int i = 4; i < 21; i++) {
            arr[i] = (i-1)*(arr[i-1]+arr[i-2]);
            factorialArr[i] = i*factorialArr[i-1];
        }
         
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            long ans = 1;
            for (int i = n; i >= (n-m+1); i--) {
                ans *= i;
            }
            ans /= factorialArr[m];
            ans *= arr[m];
            System.out.println(ans);
        }
        sc.close();
    }
}