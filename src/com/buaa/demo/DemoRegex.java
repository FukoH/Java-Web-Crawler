package com.buaa.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����һ����б���ᱻ��Ϊ��ת���ַ���������Ҫ�ټ�һ��
		String regex = "1\\d{10}";
		System.out.println("23900000009".matches(regex));
		
		
		String str = "asdf13209099090ewewr13987877873";
		//Pattern����������������
		Pattern p = Pattern.compile("1\\d{10}");
		//ʹ��p�Ĺ���ȥƥ��str
		Matcher m = p.matcher(str);
		//����ѭ����ȡƥ����������
		while(m.find()) {
			//��ȡ����
			String phoneNum = m.group();
			System.out.println(phoneNum);
		}
	}

}
