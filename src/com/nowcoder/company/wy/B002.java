package com.nowcoder.company.wy;

import java.util.Scanner;

public class B002 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
		int R = sc.nextInt();
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		int x0 = sc.nextInt();
		int y0 = sc.nextInt();
		int level = 0;
		R *= R;
		if(dis(x1,y1,x0,y0) <= R)
			level++;
		if(dis(x2,y2,x0,y0) <= R)
			level++;
		if(dis(x3,y3,x0,y0) <= R)
			level++;
		System.out.println(level+"x");
		}
	}
	public static double dis(int a, int b,int a0, int b0){
		double dis = 0;
		dis = ((a-a0)*(a-a0)+(b-b0)*(b-b0)) ;
		return dis;
	}
}
