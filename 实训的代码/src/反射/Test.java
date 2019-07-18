package ����;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test {
	public static void main(String[] args) {
		try {
			//���ļ��л�ȡ�����ƺͷ�������
			File f = new File("D:\\Practice\\src\\a.txt");
			Properties p = new Properties();
			p.load(new FileInputStream(f));
			String className = (String)p.get("class");
			String methodName = (String)p.get("method");
			//���������ƻ�ȡ�����
			Class clazz = Class.forName(className);
			//���ݷ������ƻ�ȡ��������
			Method m = clazz.getMethod(methodName);
			//��ȡ������
			Constructor c = clazz.getConstructor();
			//���ݹ�������ʵ����������
			Object service = c.newInstance();
			//���ö����ָ������
			m.invoke(service);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

