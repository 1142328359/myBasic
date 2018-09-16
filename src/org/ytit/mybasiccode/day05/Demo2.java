package org.ytit.mybasiccode.day05;

import java.util.Scanner;

/*
 * 用键盘录入字符串
 * import java.util.Scanner、
 * Scanner sc = new Scanner（System.in）
 * String str = sc.nextLine()
 * 
 */
public class Demo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		//使用str来接收字符串
		String str = sc.nextLine();
		
		System.out.println("str = " + str);

	}

}
