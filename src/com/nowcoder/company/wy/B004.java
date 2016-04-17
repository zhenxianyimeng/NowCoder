package com.nowcoder.company.wy;

import java.util.Scanner;

public class B004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
		int N = sc.nextInt();
		int M = sc.nextInt();
		int k = sc.nextInt();
		int[][] a = new int[N+1][M+1];
		int sum = 0;
		int tempsum;
		for(int i=0; i<k; i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			a[x][y]++;
		}
		if(M<=3 && N<=3){
			for(int i=1; i<=N; i++)
				for(int j=1; j<=M; j++)
					if(a[i][j] >= 1){
						sum++;
					}
			for(int i=1; i<=N; i++)
				for(int j=1; j<=M; j++)
					if(a[i][j] >= 1){
						a[i][j]--;
					}
			for(int i=1; i<=N; i++)
				for(int j=1; j<=M; j++)
					if(a[i][j] >= 1){
						sum++;
					}
		}
		else if(M<=3 && N>3){
			int max = 0;
			int maxindex = 0;
			for(int index=3; index<=N; index++){
				tempsum = 0;
				for(int i=index-2; i<=index; i++)
					for(int j=1; j<=M; j++){
						if(a[i][j] >= 1)
							tempsum++;
					}
				if(max < tempsum){
					max = tempsum;
					maxindex = index;
				}
			}
			sum += max;
			for(int i=maxindex-2; i<=maxindex; i++)
				for(int j=1; j<=M; j++){
					if(a[i][j] >= 1)
						a[i][j]--;
				}
			max = 0;
			for(int index=3; index<=N; index++){
				tempsum = 0;
				for(int i=index-2; i<=index; i++)
					for(int j=1; j<=M; j++){
						if(a[i][j] >= 1)
							tempsum++;
					}
				if(max < tempsum){
					max = tempsum;
				}
			}
			sum += max;
		}
		else if(M>3 && N<=3){

			int max = 0;
			int maxindex = 0;
			for(int index=3; index<=M; index++){
				tempsum = 0;
				for(int j=index-2; j<=index; j++)
					for(int i=1; i<=N; i++){
						if(a[i][j] >= 1)
							tempsum++;
					}
				if(max < tempsum){
					max = tempsum;
					maxindex = index;
				}
			}
			sum += max;
			for(int j=maxindex-2; j<=maxindex; j++)
				for(int i=1; i<=N; i++){
					if(a[i][j] >= 1)
						a[i][j]--;
				}
			max = 0;
			for(int index=3; index<=M; index++){
				tempsum = 0;
				for(int j=index-2; j<=index; j++)
					for(int i=1; i<=N; i++){
						if(a[i][j] >= 1)
							tempsum++;
					}
				if(max < tempsum){
					max = tempsum;
				}
			}
			sum += max;
			
		
		}
		else {
			int max = 0;
			int maxindexi = 0;
			int maxindexj = 0;
			for(int indexi=3; indexi<=N; indexi++){
				for(int indexj=3; indexj<=M; indexj++){
					tempsum = 0;
					for(int i=indexi-2; i<=indexi; i++)
						for(int j=indexj-2; j<=indexj; j++){
							//tempsum += a[i][j];
							if(a[i][j] >= 1)
								tempsum++;
						}
					if(max < tempsum){
						max = tempsum;
						maxindexi = indexi;
						maxindexj = indexj;
					}
				}
			}
			for(int i=maxindexi-2; i<=maxindexi; i++)
				for(int j=maxindexj-2; j<=maxindexj; j++){
					if(a[i][j] >= 1)
						a[i][j]--;
				}
			sum += max;
			max = 0;
			for(int indexi=3; indexi<=N; indexi++){
				for(int indexj=3; indexj<=M; indexj++){
					tempsum = 0;
					for(int i=indexi-2; i<=indexi; i++)
						for(int j=indexj-2; j<=indexj; j++){
							//tempsum += a[i][j];
							if(a[i][j] >= 1)
								tempsum++;
						}
					if(max < tempsum){
						max = tempsum;
					}
				}
			}
			sum += max;
			//System.out.println(maxindexi+"  "+maxindexj);
			
		}
		System.out.println(sum);
		}
	}
}
