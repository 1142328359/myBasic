package org.ytit.mybasiccode.day05;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//创建对象
		Scanner sc = new Scanner(System.in);
		//录入数据
		System.out.println("请输入一个值：");
		int num = sc.nextInt();
		
		//判断这个数是奇数还是偶数
		if (num % 2 == 0) {
			System.out.println("这个数是一个偶数");
		} else {
			System.out.println("这个数是一个奇数");
		}
		
		//用三目运算符改进
		String str = (num % 2 == 0)?"偶数":"奇数";
		System.out.println("这个数是一个" + str);

	}

}
