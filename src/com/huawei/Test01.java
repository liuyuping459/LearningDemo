package com.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * ºÏ≤È ‰»Î◊÷∑˚¥Æ÷–¿®∫≈ «∑Ò∆•≈‰
 * @author liu
 *
 */
public class Test01 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			char[] clist= br.readLine().trim().toCharArray();
			Stack stack = new Stack();
			for(int i = 0; i < clist.length; i++) {
				if (clist[i] == '(' || clist[i] == '[') {
					stack.add(clist[i]);
				}
				else if (clist[i] == ')') {
					if (stack.get() != '(') {
						System.out.println("0");
						return;
					}
				}
				else if (clist[i] == ']') {
					if (stack.get() != '[') {
						System.out.println("0");
						return;
					}
				}
			}
			if (stack.isEmpty()) {
				System.out.println("1");
			}
			else {
				System.out.println("0");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class Stack {
	List<Character> list = new ArrayList<Character>();
	
	public void add(char c) {
		list.add(c);
	}
	
	public char get() {
		char c = list.get(list.size() - 1);
		list.remove(list.size() - 1);
		return c;
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public void show() {
		for(Character character : list) {
			System.out.println(character);
		}
	}
}
