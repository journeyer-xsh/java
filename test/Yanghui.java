package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class Yanghui {
	public static void main(String[] args){
		//�������
		Yanghui yang = new Yanghui();
//		int h=5;
		System.out.println("������������ǵ�������");
		Scanner input = new Scanner(System.in);
		int h = input.nextInt();
		
		yang.yanghui(h);
		
	}
	public void yanghui(int h){    //hΪ������ǵ�����
		int [][]Y = new int[h][2*h-1];
		//ȷ����һ��	
		for(int p=0;p<2*h-1;p++){
			Y[0][p] = 0;
		}
		Y[0][h-1]=1;
		int n=0;
		
		for(int z=1;z<h;z++){		//z��ʾ������n��ʾ����
			
			for(n=1;n<2*h-2;n++){					
				Y[z][n] = Y[z-1][n-1]+Y[z-1][n+1];		
			}
			if(z==(h-1)&&(n==0|n==2*h-2)){
				Y[z][n]=1;
				Y[h-1][0]=1;
			}	
		}
		
		
		
		for(int i=0;i<h;i++){
			for(int j=0;j<2*h-1;j++){
				if(Y[i][j]!=0){
					System.out.print(Y[i][j]);
				}else if(Y[i][j]==0){
					System.out.print("  ");
				}
						
			}
			System.out.println();
		}
		
		
	}

}
