package org.ytit.mybasiccode.day04;

public class T1 {
	
	//对三目运算符（）？（）：（）的使用
	//三目运算符可以将简单的if语句简化，能够加快CPU的远算
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		//这里使用了两个三目运算符，对三个数值进行了大小判断
		int z = (a > b)?((a > c)?a:c):((b > c)?b:c);
		
		System.out.println("z: " + z);
	}

}
