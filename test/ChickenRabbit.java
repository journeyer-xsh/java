package com.test;

import java.util.Scanner;

public class ChickenRabbit{
	public static void main(String[] args){
		ChickenRabbit test =new ChickenRabbit();
		//test.chickenRabbit();
		//test.guessNumber();
		//test.multiplication();
		test.cumulative();
		
	}
	/*����ͬ��*/
	public  void chickenRabbit(){
		int chicken,rabbit;
		int x,y;
		System.out.println("������ͷ�ͽŵ���Ŀ��");
		Scanner input = new Scanner(System.in);
		int head = input.nextInt();
		int boot = input.nextInt();
		while(true){
			if(head<0|boot<0){
				System.out.print("����������������������");
				head = input.nextInt();
				boot = input.nextInt();
			}else {
				rabbit=(boot-(head*2))/2;
				chicken=head-rabbit;
				x=rabbit+chicken;
				y=rabbit*4+chicken*2;
				
				if(x==head&y==boot){
					System.out.println("������Ŀ��"+chicken+'\t'+"�õ���Ŀ��"+rabbit);
					break;
				}else {
					System.out.print("�������������������������");
					head = input.nextInt();
					boot = input.nextInt();
				}
				
			}
			
		}
	}
	/*������*/
	public void guessNumber(){
		int x=0;
		ChickenRabbit gettype=new ChickenRabbit();
		System.out.print("��������Ҫ�µļ۸�");
		Scanner input = new Scanner(System.in);
		int number=input.nextInt();
		
		int randomNumber=(int)(Math.random()*100);
		//System.out.println("������ǣ�"+randomNumber);
		while(true){
			if(number<=0){
				System.out.println("����������");
				System.out.println("��������Ҫ�µļ۸�");
				number=input.nextInt();
			}else {
				if(number==randomNumber){
					System.out.println("�¶���");
					x++;
					System.out.println("�µĴ���Ϊ��"+x);
					break;
					 
				}else if(number>randomNumber){
					System.out.println("̫����");
					x++;
					System.out.println("��������Ҫ�µļ۸�");
					number=input.nextInt();
					
				}else if(number<randomNumber){
					System.out.println("̫����");
					System.out.println("��������Ҫ�µļ۸�");
					x++;
					number=input.nextInt();
				}	
			}	
		}
	
	}
	/*�˷��ھ�*/
	public void multiplication() {
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+i*j+"; ");
			}
			
			System.out.println();
		}
		
	}
	/*1-100�ۼ�*/
	public void cumulative() {
		int s=0;
		for(int i=1;i<=100;i++)
			s=s+i;
		System.out.println(s);
	}

	

}
