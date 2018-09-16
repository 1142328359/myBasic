package org.ytit.mybasiccode.day05;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		//接收数据
		System.out.println("请输入月份（1~12）：");
		int mouth = sc.nextInt();
		
		if (mouth >= 3 && mouth < 6) {
			System.out.println("现在是春季！");
		}else if(mouth >= 6 && mouth < 9) {
			System.out.println("现在是夏季！");
		}else if(mouth >= 9 && mouth < 12) {
			System.out.println("现在是秋季！");
		}else if(mouth >= 12 ||mouth > 0 && mouth < 3) {
			System.out.println("现在是冬季！");
		}else {
			System.out.println("抱歉，您输入的数据错误！");
		}

	}

}
