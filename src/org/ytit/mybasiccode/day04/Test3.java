package org.ytit.mybasiccode.day04;

import java.util.Scanner;

/*
	分析：
		建包: import java.util.Scanner;
		
		创建对象：
		Scanner sc = new Scanner(System.in);
		
		录入数据：
		System.out.println("请输入第一个值:");
		int num1 = sc.nextInt();
		
		System.out.println("请输入第二个值:");
		int num2 = sc.nextInt();\
		
		比较：
			运用“==”进行比较


 */
public class Test3 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		//录入数据
		System.out.println("请输入第一个值:");
		int num1 = sc.nextInt();
		
		System.out.println("请输入第二个值:");
		int num2 = sc.nextInt();
		
		//进行比较
		boolean a = (num1 == num2)?true:false;
		
		System.out.println("这两个数据相等吗？" + a);

	}

}
