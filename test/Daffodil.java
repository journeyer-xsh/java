package com.test;
import java.util.Arrays;
import java.util.Scanner;

public class Daffodil {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个范围的最小值：");
		int min = input.nextInt();
		System.out.println("请输入一个范围的最大值：");
		int max = input.nextInt();
		
		Daffodil daffodidl1 = new Daffodil();
		int e=1,r=0;
		int []b = new int[45];   //m表示多少个水仙花数
		
		for(int n=min;n<=max;n++) {			//n存放当前数
			int p = daffodidl1.sum(n);  //获取运算结果
			
			if(n==p) {
				System.out.println("这个数是水仙花数");
				//System.out.println(n);
				b[r]=n;
				r++;
				e++;
	
			}
		}
	
		
		System.out.print("水仙花数是：");
		for(int v=0;v<e-1;v++) {
			System.out.print(b[v]+"  ");
		}
		
	}
	
	//判断位数
	public int getDigits(int number) {
		int d=1;
		while(!(number<10)) {
			number=number/10;
			d++;
		}
		return d;
		
		
	}
	//计算N位数的每一位的N次方之和
	public int sum(int min) {
		int s=0;  //总和
		int b=1;  //某一位的N次方
		
		
		Daffodil daffodil = new Daffodil();
		int N = daffodil.getDigits(min);  //获取位数
		//System.out.println(N);
		int []a = new int[N];
		for(int i=N-1;i>=0;i--){
			a[i] = min%10;
			min=min/10;
			
		}
		//System.out.println(Arrays.toString(a));  //将数组整体输出
			

		for(int j=0;j<N;j++) {			
			//System.out.println(a[j]);
			for(int z=0;z<N;z++) {
				b=b*a[j];			
			}	
			s=s+b;
			b=1;
			//System.out.println(s);
		}

		return s;
	}

}
