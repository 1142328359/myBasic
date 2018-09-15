package org.ytit.mybasiccode.day04;

/*
 *	赋值运算符
 *		基本的赋值运算符
 * 			=
 * 		扩展的赋值运算符
 * 			+=,-=,*=,/=,%=
 */
public class OperateDemo {

	public static void main(String[] args) {
		int x = 100;
		System.out.println("x: " + x);
		System.out.println("------------");
		
		int y = 200;
		y += x;//好像就是y = y + x
		System.out.println("y: " + y);
		System.out.println("x: " + x);
		System.out.println("------------");
		
		int a = 3;
		int b = 4;
        System.out.println("a += b: " + (a += b));
		//System.out.println("a += b: " + a += b);//错误: 意外的类型

	}

}
