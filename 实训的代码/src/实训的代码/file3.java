package ʵѵ�Ĵ���;

import java.io.File;
import java.util.Arrays;

public class file3 {

	public static void main(String[] args) {
	File f=new File("e:/ѧϰ����");
   //���ַ����������ʽ���ص�ǰ�ļ��������е��ļ������������ļ������ļ��У�
	String[]s=f.list();
	System.out.println(Arrays.toString(s));
	//���ļ��������ʽ���ص�ǰ�ļ����������ļ������������ļ������ļ��У�
	File[] fi =f.listFiles();
	System.out.println(Arrays.deepToString(fi));
	String parentstr=f.getParent();
	System.out.println(parentstr);
	//������е���
	f.mkdirs();
	File[] a=f.listRoots();
	System.out.println(Arrays.toString(a));
	
	}

}
