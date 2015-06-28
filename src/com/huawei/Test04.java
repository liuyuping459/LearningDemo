package com.huawei;

/**
 * 1、选秀节目打分，分为专家评委和大众评委，score[] 数组里面存储每个评委打的分数，judge_type[] 里存储与 score[] 数组
 * 对应的评委类别，judge_type[i] == 1，表示专家评委，judge_type[i] == 2，表示大众评委，n表示评委总数。打分规则如下：
 * 专家评委和大众评委的分数先分别取一个平均分（平均分取整），然后，总分 = 专家评委平均分  * 0.6 + 大众评委 * 0.4，总分取整。
 * 如果没有大众评委，则 总分 = 专家评委平均分，总分取整。函数最终返回选手得分。
 * @author liu
 *
 */
public class Test04 {
	public static void main(String[] args) {
		int[] score = {20,30,40,50,60};
		int[] judge_type = {1,1,1,2,2};
		int n = 5;
		System.out.println(new Test04().judge(score, judge_type, n));
	}
	
	public int judge(int[] score, int[] judge_type, int n) {
		int average = 0;
		int expertScore = 0;
		int expertNum = 0;
		int publicScore = 0;
		int publicNum = 0;
		for (int i = 0; i < score.length; i++) {
			if (judge_type[i] == 1) {
				expertScore += score[i];
				expertNum += 1;
			}
			else if (judge_type[i] == 2) {
				publicScore += score[i];
				publicNum += 1;
			}
		}
		if (publicNum == 0) {
			average = expertScore / expertNum;
		}
		else {
			average = (int) (expertScore / expertNum * 0.6 + publicScore / publicNum * 0.4);
		}
		return average;
	}
}
