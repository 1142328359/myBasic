package org.ytit.mybasiccode.day02;

/**
 * 需求：
 * 	写一个HelloWorld类，向控制台输出“HelloWorld！”
 * 分析：
 * 	A：定义一个类，起名叫HelloWorld，格式：classHelloWorld
 *  B：因为这个类要独立运行，所以这个类需要一个main主方法
 *  	固定格式：
 *  		public static void main(String [] args){}
 *  实现：
 *  	通过一个输出语句，将HelloWorld输出到控制台上
 * @author jiangcheng
 *
 */
//定义的一个类
public class HelloWorld
{
	public static void main(String[] args)
	{
		/*
		 * 这是一个入口
		 * public 公共的
		 * static 静态的
		 * void main的返回值
		 */
		System.out.println("HelloWrold!");
		System.out.println("LeBron James");
		System.out.println("KoBe BrYant");
		System.out.println("Stephen"+"Curry");
	}

}
