package ʵѵ�Ĵ���;

import java.io.File;
import java.util.Date;

public class file2 {

	public static void main(String[] args) {
	   File f1=new File("d:/JAVAFolder");
	   System.out.println(f1.getAbsolutePath());
	   File f2=new File("JAVAOK.exe");
	   System.out.println(f2.getAbsolutePath());
	   File f3=new File(f1,"JAVAOK.exe");
	   System.out.println(f3.getAbsolutePath());
	   
	   File f =new File("d:/JAVAFolder/JAVAOK.exe");
	   System.out.println("��ǰ�ļ���"+f);
	   System.out.println("�ж��Ƿ����"+f.exists());
	   System.out.println("�ж��Ƿ����ļ���"+f.isDirectory());
	   System.out.println("�ж��Ƿ����ļ�"+f.isFile());
	   System.out.println("�ļ�����"+f.length());
	   long time = f.lastModified();
	   Date d=new Date(time);
	   System.out.println("�ļ�����޸�ʱ��"+d);
	   
	}

}
