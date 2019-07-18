package 实训的代码;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class file {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		ObjectOutputStream oos =null;
		try {
			fos=new FileOutputStream("e:/customer.txt");
			oos=new ObjectOutputStream(fos);
			Customer c1=new Customer("jenny",20,"1111");
			Customer c2=new Customer("lisa",10,"222");
			System.out.println("-----对象序列化----");
			
			oos.writeObject(c1);
			oos.writeObject(c2);
			oos.flush();
			
		}catch(FileNotFoundException  e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(null !=fos) {
					fos.close();
			
				}if(null!=oos) {
					oos.close();
				}
			}catch(IOException e ) {
				e.printStackTrace();
			}
		}
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis=new FileInputStream("e:/customer.txt");
			ois=new ObjectInputStream(fis);
			Object c=null;
			while ((c=ois.readObject())!=null) {
				Customer c1=(Customer)c;
				System.out.println(c1.age+" "+c1.name+" "+c1.password);
				
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(EOFException e ) {
			System.out.println("读取完毕");
		
			e.printStackTrace();
	}catch(IOException e ) {
		e.printStackTrace();
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
	}
}
