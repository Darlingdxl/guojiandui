package 实训的代码;

import java.io.File;
import java.util.Arrays;

public class file3 {

	public static void main(String[] args) {
	File f=new File("e:/学习工作");
   //以字符串数组的形式返回当前文件夹下所有的文件（不包含子文件及子文件夹）
	String[]s=f.list();
	System.out.println(Arrays.toString(s));
	//以文件数组的形式返回当前文件夹下所有文件（不包括子文件及子文件夹）
	File[] fi =f.listFiles();
	System.out.println(Arrays.deepToString(fi));
	String parentstr=f.getParent();
	System.out.println(parentstr);
	//输出所有的盘
	f.mkdirs();
	File[] a=f.listRoots();
	System.out.println(Arrays.toString(a));
	
	}

}
