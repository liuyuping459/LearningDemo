package com.huawei;

/**
 * 
 * @param inputStr
 *            输入字符串
 * @param outputStr
 *            输出判断结果
 * 
 * @description： 输入的inputStr是合法的IP，返回YES，否则返回NO 示例 输入：10.138.15.1 返回：YES
 * 
 */
public class Test09 {
	public void checkIP(String inputStr, StringBuffer outputStr) {		
		if (!inputStr.matches("[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}")) {
			outputStr.append("NO");
			return;
		}
		String[] array = inputStr.split("\\.");
		for (int i = 0; i < array.length; i++) {
			if (!(Integer.valueOf(array[i]) < 256)) {
				outputStr.append("NO");
				return;
			}
		}
		outputStr.append("YES");
	}
}
