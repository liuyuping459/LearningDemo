package com.huawei;

/**
 * 3、操作系统任务调度问题。操作系统任务分为系统任务和用户任务两种。其中，系统任务的优先级 < 50，用户任务的优先级 >= 50且 <= 255。
 * 优先级大于255的为非法任务，应予以剔除。现有一任务队列task[]，长度为n，task中的元素值表示任务的优先级，数值越小，优先级越高。
 * 函数scheduler实现如下功能，将task[] 中的任务按照系统任务、用户任务依次存放到 system_task[] 数组和 user_task[] 数组中
 * （数组中元素的值是任务在task[] 数组中的下标），并且优先级高的任务排在前面，优先级相同的任务按照入队顺序排列（即先入队的任务排在
 * 前面），数组元素为-1表示结束。例如：task[] = {0, 30, 155, 1, 80, 300, 170, 40, 99}    
 * system_task[] = {0, 3, 1, 7, -1}    user_task[] = {4, 8, 2, 6, -1}
 * 
 *  函数接口    void scheduler(int task[], int n, int system_task[], int user_task[])
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
