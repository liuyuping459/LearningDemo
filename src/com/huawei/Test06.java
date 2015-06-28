package com.huawei;

/**
 * 3������ϵͳ����������⡣����ϵͳ�����Ϊϵͳ������û��������֡����У�ϵͳ��������ȼ� < 50���û���������ȼ� >= 50�� <= 255��
 * ���ȼ�����255��Ϊ�Ƿ�����Ӧ�����޳�������һ�������task[]������Ϊn��task�е�Ԫ��ֵ��ʾ��������ȼ�����ֵԽС�����ȼ�Խ�ߡ�
 * ����schedulerʵ�����¹��ܣ���task[] �е�������ϵͳ�����û��������δ�ŵ� system_task[] ����� user_task[] ������
 * ��������Ԫ�ص�ֵ��������task[] �����е��±꣩���������ȼ��ߵ���������ǰ�棬���ȼ���ͬ�����������˳�����У�������ӵ���������
 * ǰ�棩������Ԫ��Ϊ-1��ʾ���������磺task[] = {0, 30, 155, 1, 80, 300, 170, 40, 99}    
 * system_task[] = {0, 3, 1, 7, -1}    user_task[] = {4, 8, 2, 6, -1}
 * 
 *  �����ӿ�    void scheduler(int task[], int n, int system_task[], int user_task[])
 * @author liu
 *
 */
public class Test06 {
	public static void main(String[] args) {
		int task[] = {0, 30, 155, 1, 80, 300, 170, 40, 99};
		int system_task[] = new int[5];
		int user_task[] = new int[5];
		int n = 9;
		new Test06().scheduler(task, n, system_task, user_task);
		for (int i : system_task) {
			System.out.println(i);
		}
		for (int i : user_task) {
			System.out.println(i);
		}
	}
	
	void scheduler(int task[], int n, int system_task[], int user_task[]) {
		int[] index = sort(task);
		int s = 0;
		int u = 0;
		for (int i = 0; i < task.length; i++) {
			if (task[i] < 50) {
				system_task[s++] = index[i];
			}
			else if (task[i] <= 255) {
				user_task[u++] = index[i];
			}
		}
		system_task[s] = -1;
		user_task[u] = -1;
	}
	
	private int[] sort(int task[]) {
		int[] num = new int[task.length];
		for (int i = 0; i < num.length; i++) {
			num[i] = i;
		}
		for (int i = 1; i < task.length; i++) {
			for (int k = 0; k < task.length - i; k++) {
				if (task[k] > task[k + 1]) {
					int temp = task[k];
					task[k] = task[k + 1];
					task[k + 1] = temp;
					
					temp = num[k];
					num[k] = num[k + 1];
					num[k + 1] = temp;
				}
			}
		}
		return num;
	}
}
