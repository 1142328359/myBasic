package org.ytit.mybasiccode.day02;
/*
数据类型
        java语言是强数据类型，也就是所有的变量都严格按数据类型定义
分类:
    基本数据类型:（四种八类）
	    A：整数类型
		                字节数
		        byte:     1     -128~127
				short:    2
				int:      4
				long:     8
				注意：默认情况下，int类型
				
		B：浮点类型
		                字节数
		        float：   4
					double：  8
				
		C：字符类型
		                字节数
		        char：    2
		D：布尔类型
		                字节数
				boolean： 1
	引用数据类型：（面向对象中讲）
*/
public class DataTypeDemo
{

	public static void main(String[] args)
	{
		byte b = 100;
		//byte b = 128;这里会报错，原因是128超出了Byte的数据范围
		System.out.println("b= " + b);
		
		short s = 10000;
		System.out.println("s= " + s);
		
		int i = 500;
		long l = 100000000l;//long类型必须加l或者L 
		System.out.println("i="+ i);
		System.out.println("l="+ l);
		
		float f = 10.5F;  //在为小数默认是double 类型，所以float类型初始值应该在后面加上或者F
		System.out.println("f="+ f);
		
		double d = 100.58;//小数默认就是double 类型
		System.out.println("d="+ d);
		
		boolean isLove = true;
		System.out.println("isLove="+ isLove);
		
		char ch ='A';
		System.out.println("ch="+ ch);
	}

}
