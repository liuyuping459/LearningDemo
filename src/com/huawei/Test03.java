package com.huawei;

import java.util.Stack;

/**
 *  �����⣬����һ�����ʽ��û�����ţ�����С��0-9֮�䣬��������������е��м�����Ϊ���Ρ�
 *  ����:  ���룺3+8��2/9-2  
 *  �����2  
 *  ����ԭ�� 
 *  public int getMyRet(String str)
 * @author liu
 *
 */
public class Test03 {
	public static void main(String[] args) {
		String str = "3+8*2/9-2";	// 382*9/+2- 
		Test03 test = new Test03();
		System.out.println(test.getMyRet(str));
	}
	
	public int getMyRet(String str) {
		int temp = 0;
		
		Stack<String> left = new Stack<String>();
		Stack<String> right = new Stack<String>();
		
		char[] c = str.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
			right.add(String.valueOf(c[i]));
		}
		while(!right.isEmpty()) {
			if (isNum(right.peek())) {
				left.add(right.pop());
			}
			else if (right.peek().equals("*")) {
				right.pop();
				temp = Integer.valueOf(left.pop()) * Integer.valueOf(right.pop());
				left.add(String.valueOf(temp));
			}
			else if (right.peek().equals("/")) {
				right.pop();
				temp = Integer.valueOf(left.pop()) / Integer.valueOf(right.pop());
				left.add(String.valueOf(temp));
			}
			else {
				left.add(right.pop());
			}
		}
		while(!left.isEmpty()) {
			right.add(left.pop());
		}
		while(!right.isEmpty()) {
			if (isNum(right.peek())) {
				left.add(right.pop());
			}
			else if (right.peek().equals("+")) {
				right.pop();
				temp = Integer.valueOf(left.pop()) + Integer.valueOf(right.pop());
				left.add(String.valueOf(temp));
			}
			else if (right.peek().equals("-")) {
				right.pop();
				temp = Integer.valueOf(left.pop()) - Integer.valueOf(right.pop());
				left.add(String.valueOf(temp));
			}
		}
		
		return Integer.valueOf(left.pop());
	}
	
	private boolean isNum(String s) {
		return s.matches("[0-9]+");
	}
}
