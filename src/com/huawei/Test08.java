package com.huawei;

/**
 * 在Stairs函数中实现该功能：
 * 一个楼梯有N阶，从下往上走，一步可以走一阶，也可以走两阶，有多少种走法？
 * （0 
 * 例如3阶楼梯有3种走法：
 * 1、1、1
 * 1、2
 * 2、1
 * 输入样例：
 * 3
 * 返回值样例：
 * 3
 * @author liu
 *
 */
public class Test08 {
	public static void main(String[] args) {
		System.out.println(stairs(6));
	}
	public static long  stairs(int n)
	{
		long a = 0;
		long b = 1;
		long current = 0;
		
		for (int i = 1; i <= n; i++) {
			current = a + b;
			a = b;
			b = current;
		}
		return current;
	}
}
