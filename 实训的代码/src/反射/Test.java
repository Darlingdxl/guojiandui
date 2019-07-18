package 反射;

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
			//从文件中获取类名称和方法名称
			File f = new File("D:\\Practice\\src\\a.txt");
			Properties p = new Properties();
			p.load(new FileInputStream(f));
			String className = (String)p.get("class");
			String methodName = (String)p.get("method");
			//根据类名称获取类对象
			Class clazz = Class.forName(className);
			//根据方法名称获取方法对象
			Method m = clazz.getMethod(methodName);
			//获取构造器
			Constructor c = clazz.getConstructor();
			//根据构造器，实例化出对象
			Object service = c.newInstance();
			//调用对象的指定方法
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

