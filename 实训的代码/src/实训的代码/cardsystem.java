package ʵѵ�Ĵ���;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.*;
import java.util.Vector;
import java.util.*;


public class cardsystem {
	public static HashMap mingdan=new HashMap();
    public static HashMap time=new HashMap();
    public static HashMap time1=new HashMap();
	public static void main(String[] args) {
		
	   Emp e=new Emp();
	   
	   
	   while (true)
		{
			System.out.println("***********");
			System.out.println("������Ա����\t1");
			System.out.println("ǩ����Ա\t2");
			System.out.println("�˳�\t0");
			System.out.println("***********");
			int cmd = new Scanner(System.in).nextInt();
			switch(cmd) {
			  case 1:e.run();break;
			  case 2:
				System.out.println("����������ǩ��ID");
			    String id= new Scanner(System.in).next();
			    
			    System.out.println(cardsystem.mingdan);
			       Cust temp= new Cust();
			               
		            if(cardsystem.mingdan.containsKey(id)) {
		            	temp.ID=id;
		            	temp.run();
		            }else {
		            	System.out.println("û�д�ID");
		            }
			break;	
			}
		
		
				
	}
	}
	}



class Cust{
	String ID;
	Date daot;
    Date tuit;
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");	
		int floag=0;

	void arrive(){
		
		if (floag==0) {
			floag=floag+1;
			Date nowDate1=new Date();
			daot=nowDate1;
			System.out.println("ǩ���ɹ�");
			System.out.println("ǩ��ʱ��Ϊ"+sdf.format(nowDate1));
			File f=new File("e:/����");
			try {
				FileWriter m=new FileWriter(f,true);
				String s=sdf.format(nowDate1);
				
				cardsystem.time.put(ID,s);
				System.out.println(cardsystem.time);
				char[]q=s.toCharArray();
				m.write(q);
				m.close();
				
				
			}catch(IOException e) {
				e.printStackTrace();
		}
		}
		else {
			System.out.println("�Ѿ�ǩ������");
		}
		
	}
	void gohome(){
	
		if (floag==0) {
			floag=floag+1;
			Date nowDate1=new Date();
			daot=nowDate1;
			System.out.println("ǩ�˳ɹ�");
			System.out.println("ǩ��ʱ��Ϊ"+sdf.format(nowDate1));
			File f=new File("e:/����");
			try {
				FileWriter m=new FileWriter(f);
				String s=sdf.format(nowDate1);
				cardsystem.time1.put(ID,s);
				
				char[]q=s.toCharArray();
				m.write(q);
				m.close();
				
				
			}catch(IOException e) {
				e.printStackTrace();
		}
			}
		else {
			System.out.println("�Ѿ�ǩ������");
			
		
		
	}
		}
	void printInfor(){
		System.out.println("�����������ѯ��ID");
		String id= new Scanner(System.in).next();
		if (cardsystem.time.containsKey(id)) {
			System.out.println("ǩ��ʱ�䣺"+cardsystem.time);
			System.out.println("ǩ��ʱ��:"+cardsystem.time1);
		}else {
			System.out.println("û�д�ID");
		}
		
	}
	void run()
	{
		boolean flag = true;
		while (flag)
		{
			System.out.println("***********");
			System.out.println("ǩ��\t1");
			System.out.println("ǩ��\t2");
			System.out.println("��ѯ\t3");
			System.out.println("�˳�\t0");
			System.out.println("***********");
			int cmd1 = new Scanner(System.in).nextInt();
			switch (cmd1)
			{
			case 1:this.arrive();break;
			case 2: int floag=0;this.gohome();break;
			case 3:this.printInfor();;break;
			case 0:return;
			}
	}
	}
}
class Emp
{
	
	
	void add()
	{
		System.out.println("������Ҫ�����Ա��ID������");
		
		File name=new File("e:/����");
		File ID=new File("e:/����");
		try {
			FileWriter fw=new FileWriter(name,true);
			FileWriter f1=new FileWriter(ID,true);
			
		String i = new Scanner(System.in).next();
		String n=new Scanner(System.in).next();
		 char[]c=n.toCharArray();
		 char[]a=i.toCharArray(); 
		 cardsystem.mingdan.put(i, n);
		   
		 System.out.println(cardsystem.mingdan);
		 fw.write(c);
		 fw.write(a+"/n");
		 fw.flush();
		 fw.close();
		   
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("��ӳɹ�");
	}
		
		
	

	void delete()
	{
		System.out.println("������ɾ����ID");
		String i=new Scanner(System.in).next();
		if(cardsystem.mingdan.containsKey(i)) {
		cardsystem.mingdan.remove(i);
	}else {
		System.out.println("û�д�ID");
	}
		}
	void search() {
		System.out.println("�������ѯ��ID");
		String i=new Scanner(System.in).next();
		if(cardsystem.mingdan.containsKey(i)) {
		System.out.println(cardsystem.mingdan);
	}
		else {
		System.out.println("û�д�ID");
	}
	}


	void run()
	{
		
		while (true)
		{
			System.out.println("**********************");
			System.out.println("�����Ա\t1");
			System.out.println("ɾ����Ա\t2");	
			System.out.println("��ѯ��Ա\t3");
			System.out.println("�˳�\t\t0");
			System.out.println("**********************");
			int cmd1 = new Scanner(System.in).nextInt();
			switch (cmd1)
			{
			case 1:this.add();
		
			break;
			case 2:this.delete();
			System.out.println("ɾ���ɹ�");
			case 3:this.search();
			break;
			case 0: return;
			}
		}
	}
}







