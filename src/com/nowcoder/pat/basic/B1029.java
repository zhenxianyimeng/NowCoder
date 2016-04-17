package com.nowcoder.pat.basic;

import java.util.Scanner;

public class B1029 {
	public static int getweek(int year){
		int week = 6;
		int day = 0;
		for(int i=2000; i<year; i++){
			if((i%4==0 && i%100!=0) || (i%400 == 0))
				day += 366;
			else
				day += 365;
		}
		week = (week + day%7 ) %7;
		return week;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
			int year = sc.nextInt();
			//System.out.println(getweek(year));
			int firstweek = getweek(year);
			boolean flag = (year%4==0 && year%100!=0) || (year%400 == 0);
			if(flag)
				month[1] = 29;
			int num = 0;
			int total = 0;
			for(int i=0; i<12; i++){
				if((firstweek + 12 +total)%7 == 5){
					if(num == 0)
						System.out.print(i+1);
					else
						System.out.print(" "+(i+1));
					num++;
				}
				total += month[i];
			}
			if(num == 0)
				System.out.println("Luck");
			else
				System.out.println();
		}
	}
}
