package com.test;
import java.util.Arrays;
import java.util.Scanner;

public class Daffodil {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����Χ����Сֵ��");
		int min = input.nextInt();
		System.out.println("������һ����Χ�����ֵ��");
		int max = input.nextInt();
		
		Daffodil daffodidl1 = new Daffodil();
		int e=1,r=0;
		int []b = new int[45];   //m��ʾ���ٸ�ˮ�ɻ���
		
		for(int n=min;n<=max;n++) {			//n��ŵ�ǰ��
			int p = daffodidl1.sum(n);  //��ȡ������
			
			if(n==p) {
				System.out.println("�������ˮ�ɻ���");
				//System.out.println(n);
				b[r]=n;
				r++;
				e++;
	
			}
		}
	
		
		System.out.print("ˮ�ɻ����ǣ�");
		for(int v=0;v<e-1;v++) {
			System.out.print(b[v]+"  ");
		}
		
	}
	
	//�ж�λ��
	public int getDigits(int number) {
		int d=1;
		while(!(number<10)) {
			number=number/10;
			d++;
		}
		return d;
		
		
	}
	//����Nλ����ÿһλ��N�η�֮��
	public int sum(int min) {
		int s=0;  //�ܺ�
		int b=1;  //ĳһλ��N�η�
		
		
		Daffodil daffodil = new Daffodil();
		int N = daffodil.getDigits(min);  //��ȡλ��
		//System.out.println(N);
		int []a = new int[N];
		for(int i=N-1;i>=0;i--){
			a[i] = min%10;
			min=min/10;
			
		}
		//System.out.println(Arrays.toString(a));  //�������������
			

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
