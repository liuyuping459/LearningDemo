package com.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * ¼ì²éÊäÈë×Ö·û´®ÖĞÀ¨ºÅÊÇ·ñÆ¥Åä
 * @author liu
 *
 */
public class Test01 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			char[] clist= br.readLine().trim().toCharArray();
			Heap heap = new Heap();
			for(int i = 0; i < clist.length; i++) {
				if (clist[i] == '(' || clist[i] == '[') {
					heap.add(clist[i]);
				}
				else if (clist[i] == ')') {
					if (heap.get() != '(') {
						System.out.println("0");
						return;
					}
				}
				else if (clist[i] == ']') {
					if (heap.get() != '[') {
						System.out.println("0");
						return;
					}
				}
			}
			if (heap.isEmpty()) {
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

class Heap {
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
