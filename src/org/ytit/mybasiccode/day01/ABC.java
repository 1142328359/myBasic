package org.ytit.mybasiccode.day01;

public class ABC
{
	public static void main(String[] args)
	{
		//可以在类中创建别的类的实例对象，然后调用该类的方法
		//由于是在同一个包下，便可以直接使用
		HelloWorld01 h = new HelloWorld01();
		h.helloWorld();
		System.out.println("我曾经失去了我的一切,");
		System.out.println("但是我想夺回我曾经的一切");
	}
	

}
