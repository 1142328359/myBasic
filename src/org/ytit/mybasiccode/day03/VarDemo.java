package org.ytit.mybasiccode.day03;

/*
	变量：
	    在程序执行的过程中，在某个范围内其值可以发生改变的量
	变量由三个要素组成：
	    变量名称、数据类型、初始值
		
	定义格式：
	    数据类型 变量名称 = 初始值
		    举例： int x = 100；<-> int x; x = 100;
	
*/
public class VarDemo
{
	public static void main(String[] args)
	{
		//定义一个变量
		//声明x是一个变量，这是JVM还没有分配内存空间
		int x;
		float price = 7.00f;
		
		//初始化变量的值，这时JVM需要给x分配内存空间
		x = 10;
		
		//建议不按上面这样定义变量
		//建议按下面的方法定义
		int y1 = 100;
		
		//向控制台输出x的值
		System.out.println(x);
		System.out.println(price);
		System.out.println(y1);
	}

}
