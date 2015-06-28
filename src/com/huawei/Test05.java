package com.huawei;

/**
 * 2、给定一个数组input[] ，如果数组长度n为奇数，则将数组中最大的元素放到 output[] 数组最中间的位置，如果数组长度n为偶数，
 * 则将数组中最大的元素放到 output[] 数组中间两个位置偏右的那个位置上，然后再按从大到小的顺序，依次在第一个位置的两边，按照一
 * 左一右的顺序，依次存放剩下的数。例如：input[] = {3, 6, 1, 9, 7}   output[] = {3, 7, 9, 6, 1};          
 *    input[] = {3, 6, 1, 9, 7, 8}    output[] = {1, 6, 8, 9, 7, 3}
 *    函数接口   void sort(int input[], int n, int output[])
 * @author liu
 *
 */
public class Test05 {
	public static void main(String[] args) {
		//int n = 5;
		//int input[] = {3, 6, 1, 9, 7};
		int n = 6;
		int input[] = {3,6,1,9,7,8};
 		int output[] = new int[n];
		new Test05().sort(input, n, output);
		for (int i = 0 ; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
	
	public void sort(int input[], int n, int output[]) {
		bubbleSort(input);
		int k = n/2;
		output[k] = input[0];
		for (int i = 1; i < (n-1)/2 + 1; i++) {
			output[k - i] = input[2*i - 1];
			output[k + i] = input[2*i];
		}
		if (n%2 == 0) {
			output[0] = input[n - 1];
		}
	}
	
	private void bubbleSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int k = 0; k < array.length - 1; k++) {
				if (array[k] < array[k + 1]) {
					int temp = array[k];
					array[k] = array[k + 1];
					array[k + 1] = temp;
				}
			}
		}
	}
}
