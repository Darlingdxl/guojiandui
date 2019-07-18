package 实训的代码;

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
			System.out.println("管理人员操作\t1");
			System.out.println("签到人员\t2");
			System.out.println("退出\t0");
			System.out.println("***********");
			int cmd = new Scanner(System.in).nextInt();
			switch(cmd) {
			  case 1:e.run();break;
			  case 2:
				System.out.println("请输入您的签到ID");
			    String id= new Scanner(System.in).next();
			    
			    System.out.println(cardsystem.mingdan);
			       Cust temp= new Cust();
			               
		            if(cardsystem.mingdan.containsKey(id)) {
		            	temp.ID=id;
		            	temp.run();
		            }else {
		            	System.out.println("没有此ID");
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
			System.out.println("签到成功");
			System.out.println("签到时间为"+sdf.format(nowDate1));
			File f=new File("e:/名单");
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
			System.out.println("已经签到过了");
		}
		
	}
	void gohome(){
	
		if (floag==0) {
			floag=floag+1;
			Date nowDate1=new Date();
			daot=nowDate1;
			System.out.println("签退成功");
			System.out.println("签退时间为"+sdf.format(nowDate1));
			File f=new File("e:/名单");
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
			System.out.println("已经签到过了");
			
		
		
	}
		}
	void printInfor(){
		System.out.println("请输入你想查询的ID");
		String id= new Scanner(System.in).next();
		if (cardsystem.time.containsKey(id)) {
			System.out.println("签到时间："+cardsystem.time);
			System.out.println("签退时间:"+cardsystem.time1);
		}else {
			System.out.println("没有此ID");
		}
		
	}
	void run()
	{
		boolean flag = true;
		while (flag)
		{
			System.out.println("***********");
			System.out.println("签到\t1");
			System.out.println("签退\t2");
			System.out.println("查询\t3");
			System.out.println("退出\t0");
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
		System.out.println("请输入要添加人员的ID和名字");
		
		File name=new File("e:/名单");
		File ID=new File("e:/名单");
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
		System.out.println("添加成功");
	}
		
		
	

	void delete()
	{
		System.out.println("请输入删除的ID");
		String i=new Scanner(System.in).next();
		if(cardsystem.mingdan.containsKey(i)) {
		cardsystem.mingdan.remove(i);
	}else {
		System.out.println("没有此ID");
	}
		}
	void search() {
		System.out.println("请输入查询的ID");
		String i=new Scanner(System.in).next();
		if(cardsystem.mingdan.containsKey(i)) {
		System.out.println(cardsystem.mingdan);
	}
		else {
		System.out.println("没有此ID");
	}
	}


	void run()
	{
		
		while (true)
		{
			System.out.println("**********************");
			System.out.println("添加人员\t1");
			System.out.println("删除人员\t2");	
			System.out.println("查询人员\t3");
			System.out.println("退出\t\t0");
			System.out.println("**********************");
			int cmd1 = new Scanner(System.in).nextInt();
			switch (cmd1)
			{
			case 1:this.add();
		
			break;
			case 2:this.delete();
			System.out.println("删除成功");
			case 3:this.search();
			break;
			case 0: return;
			}
		}
	}
}







