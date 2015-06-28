package com.huawei;

/**
 * 1��ѡ���Ŀ��֣���Ϊר����ί�ʹ�����ί��score[] ��������洢ÿ����ί��ķ�����judge_type[] ��洢�� score[] ����
 * ��Ӧ����ί���judge_type[i] == 1����ʾר����ί��judge_type[i] == 2����ʾ������ί��n��ʾ��ί��������ֹ������£�
 * ר����ί�ʹ�����ί�ķ����ȷֱ�ȡһ��ƽ���֣�ƽ����ȡ������Ȼ���ܷ� = ר����ίƽ����  * 0.6 + ������ί * 0.4���ܷ�ȡ����
 * ���û�д�����ί���� �ܷ� = ר����ίƽ���֣��ܷ�ȡ�����������շ���ѡ�ֵ÷֡�
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
