package com.huawei;

/**
 * 问题描述：
 * 我国大陆运营商的手机号码标准格式为：国家码+手机号码，例如：8613912345678。特点如下：
 * 1、  长度13位；
 * 2、  以86的国家码打头；
 * 3、  手机号码的每一位都是数字。
 * 请实现手机号码合法性判断的函数（注：考生无需关注手机号码的真实性，也就是说诸如86123123456789这样的手机号码，我们也认为是合法的），
 * 要求：
 * 1）  如果手机号码合法，返回0；
 * 2）  如果手机号码长度不合法，返回1
 * 3）  如果手机号码中包含非数字的字符，返回2；
 * 4）  如果手机号码不是以86打头的，返回3；
 * 【注】除成功的情况外，以上其他合法性判断的优先级依次降低。也就是说，如果判断出长度不合法，直接返回1即可，不需要再做其他合法性判断。
 * 要求实现函数：
 * int s int verifyMsisdn(char* inMsisdn)
 * 【输入】 char* inMsisdn，表示输入的手机号码字符串。
 * 【输出】  无
 * 【返回】  判断的结果，类型为int。
 * 示例
 * 输入：  inMsisdn = “869123456789“
 * 输出：  无
 * 返回：  1
 * 输入：  inMsisdn = “8813912345678“
 * 输出：  无
 * 返回：  3
 * 输入：  inMsisdn = “8613912345678“
 * 输出：  无
 * 返回：  0
 * @author liu
 *
 */
public class Test07 {
	public static void main(String[] args) {
		String inMsisdn = "8813912345678";
		System.out.println(new Test07().verifyMsisdn(inMsisdn));
	}
	
	public int verifyMsisdn(String inMsisdn) {
		if (13 != inMsisdn.length()) {
			return 1;
		}
		else if (!inMsisdn.matches("[0-9]*")) {
			return 2;
		}
		else if (!inMsisdn.startsWith("86")) {
			return 3;
		}
		return 0;
	}
}
