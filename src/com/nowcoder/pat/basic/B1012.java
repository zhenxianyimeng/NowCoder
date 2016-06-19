package com.nowcoder.pat.basic;

import java.util.Scanner;

public class B1012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str = sc.nextLine();
			String[] arrstr = new String[3];
			arrstr = str.split(" ");
			char op = arrstr[2].toCharArray()[0];
			int up1;
			int down1;
			if(arrstr[0].contains("/")){
				up1 = Integer.parseInt(arrstr[0].split("/")[0]);
				down1 = Integer.parseInt(arrstr[0].split("/")[1]);
			}else {
				up1 = Integer.parseInt(arrstr[0]);
				down1 = 1;
			}
			int up2;
			int down2;
			if(arrstr[1].contains("/")){
				up2 = Integer.parseInt(arrstr[1].split("/")[0]);
				down2 = Integer.parseInt(arrstr[1].split("/")[1]);
			}else {
				up2 = Integer.parseInt(arrstr[1]);
				down2 = 1;
			}
			int upOut=0;
			int downOut=0;
			//int leftOut;
			switch (op) {
			case '+':
				upOut = up1*down2 + up2*down1;
				downOut = down1 * down2;
				break;
			case '-':
				upOut = up1*down2 - up2*down1;
				downOut = down1 * down2;
				break;
			case '*':
				upOut = up1 * up2;
				downOut = down1 * down2;
				break;
			case '/':
				upOut = up1 * down2;
				downOut = down1 * up2;
				break;
			default:
				break;
			}
			int min = Math.min(Math.abs(upOut), downOut);
			int max = Math.max(Math.abs(upOut), downOut);
			int gcm = getGcm(min, max);
			/*for(int i=2; i<=min; i++){
				while(upOut%i==0 && downOut%i==0){
					upOut = upOut / i;
					downOut = downOut / i;
				}
			}*/
			System.out.println(upOut/gcm+"/"+downOut/gcm);
		}
	}
	public static int getGcm(int min, int max){
		return max%min==0? min:getGcm(max%min,min); 
	}
}
