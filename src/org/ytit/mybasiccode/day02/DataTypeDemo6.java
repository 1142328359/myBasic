package org.ytit.mybasiccode.day02;

/*
	面试题：
		byte b1=3,b2=4,b;
		b=b1+b2;
		b=3+4;
		哪句是编译失败的呢？为什么呢？
		b = b1 + b2;是有问题的。
		因为变量相加，会首先看类型问题，最终把结果赋值的也会考虑类型问题。
		常量相加，首先做加法，然后看结果是否在赋值的数据类型范围内，如果不是，才报错。
*/
public class DataTypeDemo6
{
	public static void main(String[] args)
	{
		//定义了三个byte类型的变量，b1,b2,b
		//b1的值是3，b2的值是4，b没有值
		byte b1 = 3,b2 = 4,b;
		
		//b = b1 + b2;//这个是类型提升，所以有问题
		
		//常量，先把结果计算出来，然后看是否在byte的范围中，如果不在就报错
		b = 3 + 4;
		
		System.out.println(b);

	}

}
