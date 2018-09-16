package org.ytit.mybasiccode.day05;

public class T1 {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		
		//switch分支结构
		switch(a) {
		
			//没有对应的选择结果
			default:
				a++;
			//选择对应为3的结果
			case 3:
				a++;
			//选择对应为4的结果
			case 4:
				a++;
		
		}
		System.out.println("a= " + a);		//？a= 5
		
		
		//switch分支结构中
		//若选择的结果语句中没有写break结束
		//那么就会执行下面的一条，直到所有的执行完。

	}

}
