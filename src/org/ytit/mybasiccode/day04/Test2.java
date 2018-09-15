package org.ytit.mybasiccode.day04;

import java.util.Scanner;

/*
 * 分析：
 * 	建包：import java.util.Scanner
 * 
 * 	创建对象：
 * 	Scanner sc = new Scanner(System.in);
 * 
 * 	录入数据：
 * 	System.out.println("请输入第一个值:);
 * 	int num1 = sc.nextInt();
 * 
 * 	System.out.println("请输入第二个值:");
 * 	int num2 = sc.nextInt();
 * 
 * 	System.out.println("请输入第三个值:");
 * 	int num3 = sc.nextInt();
 * 
 * 	比较：
 * 		运用两个三目运算符进行比较，使用一个temp作为中间变量
 * 
 */
public class Test2 {

	public static void main(String[] args) {
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		//从键盘接收数据
		System.out.println("请输入第一个值:");
		int num1 = sc.nextInt();
		
		System.out.println("请输入第二个值:");
		int num2 = sc.nextInt();
		
		System.out.println("请输入第三值:");
		int num3 = sc.nextInt();
		
		//开始比较
		int temp = (num1 > num2)?num1:num2;
		int Max = (temp > num3)?temp:num3;
		
		System.out.println("输出最大的数为：" + Max);

	}

}
