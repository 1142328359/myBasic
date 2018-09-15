package org.ytit.mybasiccode.day01;

/**
 * 定义一个类，这是java语言中最简单的单元
 * 定义类的格式：
 * 	class 类名{}
 * 注意：
 * 	A：错误：找不到或无法加载主类 HelloWorld
 * 		产生的原因：java源文件名和文件中的类名可能不一致
 * 	B：一个java源文件中可以定义多个类，编译后，每个类都会生成一个class文件
 * @author jiangcheng
 *
 */
public class HelloWorld02
{
	//这是一个主方法
	//它是程序的入口，java程序严格执行主方法，不管他在类的什么位置，它都是第一个被执行的
	//它是由jvm执行
	/*注意：
	 *A：一个类中只包含一个主方法
	 *B：main--主方法的名字，如果这个字写错的话，编译可以通过吗？
	 *	可以通过，但是，在执行的时候出现：
	 *	错误：在类HelloWorld中找不到主方法，请将主方法定义为：
	 *		public static void main(String [] args)
	 *C：java语言是严格区分大小写的，符号是严格区分中英格式的。
	 *D：小括号中的内容是main方法的参数列表（String [] args）
	 *E：public表示公共的，公有的，它是一个权限修饰符，也是一个关键字
	 *F：static表示静态的，他也是一个权限修饰符，也是一个关键字
	 *G：void表示main方法的返回值类型是一个空类型，即没有返回值
	 */
	public static void main(String[] args)
	{
		//这是一条语句，语句都是以;结尾（注意英文符号）
		//这条件语句是先屏幕输出一个字符串（用双引号括起来的东西）
		System.out.println("株洲欢迎你！");
	}

}



