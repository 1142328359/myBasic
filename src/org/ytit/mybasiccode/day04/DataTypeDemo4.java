package org.ytit.mybasiccode.day04;

/*
 * 强制转换：
 * 	从大的数据类型向小的数据类型转换
 * 
 * 	格式：
 * 		目标数据类型  变量  =  （目标数据类型）（被转换的数据）;
 * 
 * 	注意：
 * 		不要随意的去使用强制转换，因为它隐含了精度损失问题
 */
public class DataTypeDemo4 {

	public static void main(String[] args) {
		byte a = 3;
		int b = 4;
		
		//这个绝对没有问题
		//int c = a + b;
		
		//byte c = 7;
		//这个是有问题的 ,它不能从int到byte
//		byte c = a + b;
		
		byte c = (byte) (a + b) ;
		System.out.println("c: " + c);
		
		byte x = (byte) 129;
		
		System.out.println("x: " + x);
		/*
		 130 补码：
		 
		 
		   -128 --- 127
		   -128 --- 128
		   -127 --- 129
		   -126 --- 130
		   
		  浮点数远远比long的数据大
		*/

	}

}
