package com.nowcoder.pat.basic;

import java.util.Scanner;
public class B1032 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while (sc.hasNext()){
        int N = sc.nextInt();
        int M = sc.nextInt();
        int count = 0;
        for (int i = 2; i <= N; i++){
            count = (count + M) % i;
        }
        System.out.println(count + 1);
    }
 
   
   }
}
