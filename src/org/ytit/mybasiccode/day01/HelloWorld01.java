package org.ytit.mybasiccode.day01;

public class HelloWorld01
{
	public static void main(String[] args)
	{
		//创造一个自己类的实例对象
		HelloWorld01 h = new HelloWorld01();
		//通过实例对象去调用类的方法
		h.helloWorld();
	}
	//类的一个方法
	public void helloWorld(){
		System.out.println("你好，世界！");
	}

}
