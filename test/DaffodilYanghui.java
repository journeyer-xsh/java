package com.test;

import java.util.Scanner;

public class DaffodilYanghui {
	public static void main(String[] args) {
		DaffodilYanghui daffodilyanghui = new DaffodilYanghui();
		int min=12;
		int And=0;
		And=daffodilyanghui.getDigts(min);
		System.out.println(And);
		
		
		
	}
	//ˮ�ɻ���
	public void daffodilNumber() {
		DaffodilYanghui daffodil =new DaffodilYanghui();
		int n=0;
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����Χ��Сֵ");
		int min = input.nextInt();
		System.out.println("������һ����Χ���ֵ");
		int max = input.nextInt();
		for(int i=min;i<=max;i++) {
			n=daffodil.getDigts(min);     //��ȡλ��
			
			
		}
		
		
		
	}
	//��ȡnλ����ÿһλ����n�η�֮��
	public int getDigts(int min) {
		int s=1;  
		
		int x=1,y=0,N=0;
		int and=0;
		int []a = new int[N];
		while(!(min<10)) {
			a[N] = min%10;
			min = min/10;
			N++;
			x++;		
		}
		//System.out.println(x+1);
		//����
		for(int i=0;i<=a.length;i++) {
			for(int j=0;j<=a.length;j++) {
				and=s*a[i];
			}
			s=s+and;
			
		}
		return s;
	}


}
