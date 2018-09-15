package org.ytit.mybasiccode.day03;

public class Change
{
	public static void main(String[] args)
	{
		int a = 15, b = 9 , c = 19 ;

		//定义输入的转换数值
		System.out.print("十进制数"+a+"=>十六进制输出：");
		cha_16(a);
		//换行
		System.out.println();
		
		System.out.print("十进制数"+b+"=>二进制输出：");
		cha_2(b);
		System.out.println();

		System.out.print("十进制数"+c+"=>八进制输出：");
		cha_8(c);
	}
	
	//转化为16进制
	public static void cha_16(int n){
		if (n >= 16) {
			cha_16(n/16);
		}
		if (n%16 < 10) {
			System.out.print(n%16);
		} else {
			System.out.print((char)(n%16 + 55)); 
		}
	}
	
	//转化为2进制
	public static void cha_2(int n){
		if (n >= 2) {
			cha_2(n/2);
		}
		System.out.print(n%2);
	}
	
	//转化为8进制
	public static void cha_8(int n){
		if (n >= 8) {
			cha_8(n/8);
		}
		System.out.print(n%8);
	}

}
