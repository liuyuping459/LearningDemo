package com.huawei;

/**
 * 
 * @param inputStr
 *            �����ַ���
 * @param outputStr
 *            ����жϽ��
 * 
 * @description�� �����inputStr�ǺϷ���IP������YES�����򷵻�NO ʾ�� ���룺10.138.15.1 ���أ�YES
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
