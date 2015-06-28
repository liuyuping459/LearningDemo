package com.huawei;

/**
 * ��һ�⣬�����ַ�������len1���ַ���s1���ַ�������len2���ַ���s2���Ӻ���ǰ�Ƚϣ�������ַ���Ϊ��׼�������ͬ��Ԫ�صĸ�����
 * ����:  ���룺s1="1,3,5"   len1=3        s2="2,4,1,7,5"   len2=5  
 * 		�����2  
 * ����ԭ��
 * public int getDiffNum(int len1, String s1, int len2, String s2)
 * @author liu
 *
 */
public class Test02 {
	public static void main(String[] args) {
		Test02 test = new Test02();
		System.out.println(test.getDiffNum(3, "1,3,5", 5, "2,4,1,7,5"));
	}
	
	public int getDiffNum(int len1, String s1, int len2, String s2) {
		int num = 0;
		int[] array1 = getArray(s1, len1);
		int[] array2 = getArray(s2, len2);
		int k = len1 > len2 ? len2 : len1;
		for (int i = 0; i < k; i++) {
			if (array1[i] == array2[i]) {
				num+=1;
			}
		}
		
		return num;
	}
	
	private int[] getArray(String str, int len) {
		String[] array = new String[len];
		int[] intArray = new int[len];
		array = str.split(",");
		for (int i = 0; i < len; i++) {
			intArray[len - i - 1] = Integer.valueOf(array[i]);
		}
		return intArray;
	}
}
