package org.ytit.mybasiccode.day05;

/*
 * 需求：	1、输出1~100的偶数
 * 		2、求1~100的偶数和
 * 
 * 分析：
 * 		A：题目中的“1~100”告诉了我们一个范围，我们可以使用for语句来实现
 * 		B：判断是偶数
 * 		C：求和
 * 			a、定义一个sum变量（初值为0），用来存和
 * 			b、变量相加，结果存入sum中
 * 			c、改变第2个变量的值
 */
public class New {

	public static void main(String[] args) {
		//首先打印出1~100的偶数
		for (int i = 0; i <= 100; i++) {
			//判断
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("----------");
		
		//求1~100的偶数和
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if(i % 2 == 0){
				sum += i;
			}
		}
		System.out.println("sum = " + sum);
		System.out.println("----------");
		
		//优化求和的代码
		int sum2 = 0;
		for (int i = 0; i <= 100; i += 2) {
			sum2 += i;
		}
		System.out.println("sum2 = " + sum2);

	}

}
