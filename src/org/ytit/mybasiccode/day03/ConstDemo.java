package org.ytit.mybasiccode.day03;

/*
	常量：
	     在程序执行的过程其值不可以发生改变
		 在程序中一眼看过去就知道是什么含义的数据
		 
	java中常量分类：
	    字面值常量
		    A：字符串常量  用双引号括起来的
			    举例："HelloWorld","鹿晗"
			B：整数型常量
		               举例：10,100,1000
			C:浮点型常量
			    举例：3.14,10.265
			D:字符常量  用单引号括起来的数据
			    举例：'A','B'
				    错误：'ab'
			E:布尔型常量
			    举例：true，false
			F:空常量
			    举例：null
*/
public class ConstDemo
{
	public static void main(String[] args)
	{
		System.out.println("这是一个关于常量的Deme类");
		System.out.println(100);
		System.out.println(3.14);
		System.out.println('A');
		System.out.println(true);

	}

}
