package com.buaa.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

public class DemoURL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//��������ץȡҳ����ļ���
			String savePath = "D:/savePath/";
			String fileName = System.currentTimeMillis() + ".txt";
			File file = new File(savePath + fileName);
			PrintWriter pw = new PrintWriter(file);
			// ��������ҳ�洴��URL����
			URL url = new URL("http://news.sina.com.cn");
			// ��������
			URLConnection conn = url.openConnection();
			// ��ȡ��ҳ�е����ݣ������ֽ�������ʽ����
			InputStream is = conn.getInputStream();
			//������Ҫ���ж�ȡ������is���ֽ�����ֻ�ܰ����ֽڶ�ȡ
			//������Ҫʹ�û�����
			//�Ƚ�isת�����ַ�����Ȼ����ʹ�û���������ȡ
			//�����Ҫת�룬��ô��is����Ҫ����Ӧ���ַ�����
			BufferedReader br = new BufferedReader(
					new InputStreamReader(is, "UTF-8"));
			//��������ÿ�ζ�ȡ��һ������
			String line = null;
			//����ȡ������һ�����ݸ�ֵ��line,Ȼ���ж�line�Ƿ�Ϊ�ա�
			//�����ȡ����nullֵ������ζ�Ŷ�ȡ�������
			while((line=br.readLine())!=null) {
				pw.println(line);
			}
			//�ر�����
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
