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
	/*鸡兔同笼*/
	public  void chickenRabbit(){
		int chicken,rabbit;
		int x,y;
		System.out.println("请输入头和脚的数目：");
		Scanner input = new Scanner(System.in);
		int head = input.nextInt();
		int boot = input.nextInt();
		while(true){
			if(head<0|boot<0){
				System.out.print("请输入正数，请重新输入");
				head = input.nextInt();
				boot = input.nextInt();
			}else {
				rabbit=(boot-(head*2))/2;
				chicken=head-rabbit;
				x=rabbit+chicken;
				y=rabbit*4+chicken*2;
				
				if(x==head&y==boot){
					System.out.println("鸡的数目："+chicken+'\t'+"兔的数目："+rabbit);
					break;
				}else {
					System.out.print("您输入的数据有误，请重新输入");
					head = input.nextInt();
					boot = input.nextInt();
				}
				
			}
			
		}
	}
	/*猜数字*/
	public void guessNumber(){
		int x=0;
		ChickenRabbit gettype=new ChickenRabbit();
		System.out.print("请输入你要猜的价格：");
		Scanner input = new Scanner(System.in);
		int number=input.nextInt();
		
		int randomNumber=(int)(Math.random()*100);
		//System.out.println("这个数是："+randomNumber);
		while(true){
			if(number<=0){
				System.out.println("请输入正数");
				System.out.println("请输入你要猜的价格：");
				number=input.nextInt();
			}else {
				if(number==randomNumber){
					System.out.println("猜对了");
					x++;
					System.out.println("猜的次数为："+x);
					break;
					 
				}else if(number>randomNumber){
					System.out.println("太高了");
					x++;
					System.out.println("请输入你要猜的价格：");
					number=input.nextInt();
					
				}else if(number<randomNumber){
					System.out.println("太低了");
					System.out.println("请输入你要猜的价格：");
					x++;
					number=input.nextInt();
				}	
			}	
		}
	
	}
	/*乘法口诀*/
	public void multiplication() {
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+i*j+"; ");
			}
			
			System.out.println();
		}
		
	}
	/*1-100累加*/
	public void cumulative() {
		int s=0;
		for(int i=1;i<=100;i++)
			s=s+i;
		System.out.println(s);
	}

	

}
