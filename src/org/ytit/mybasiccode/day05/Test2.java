package org.ytit.mybasiccode.day05;

import java.util.Scanner;

/*
 * x和y的关系满足如下：
 * 	x>=3 	y=2x+1
 * 	-1<=x<3 y=2x
 * 	x<-1	y=2x-1
 * 
 */
public class Test2 {

	public static void main(String[] args) {
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		//接收数据
		System.out.println("请输入x的值：");
		int x = sc.nextInt();
		
		int y = 0;
		//定义变量y，用来保存结果
		
		//用ifelseif实现判断
		if (x >= 3) {
			y = 2 * x + 1; 
		} else if (x >= -1 && x < 3) {
			y = 2 * x;
		} else if (x < -1) {
			y = 2 * x - 1;
		}
		
		System.out.println("y的值为：" + y);

	}

}
