package 实训的代码;

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
	   System.out.println("当前文件是"+f);
	   System.out.println("判断是否存在"+f.exists());
	   System.out.println("判断是否是文件夹"+f.isDirectory());
	   System.out.println("判断是否是文件"+f.isFile());
	   System.out.println("文件长度"+f.length());
	   long time = f.lastModified();
	   Date d=new Date(time);
	   System.out.println("文件最后修改时间"+d);
	   
	}

}
