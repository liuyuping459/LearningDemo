package com.huawei;

/**
 * ��Stairs������ʵ�ָù��ܣ�
 * һ��¥����N�ף����������ߣ�һ��������һ�ף�Ҳ���������ף��ж������߷���
 * ��0 
 * ����3��¥����3���߷���
 * 1��1��1
 * 1��2
 * 2��1
 * ����������
 * 3
 * ����ֵ������
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
