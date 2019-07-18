package 实训的代码;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;
public class shixun6 {
	

	public static void main(String[] args) {
		HashMap ID=new HashMap();
		ID.put("路明非", new Integer(20000));
		ID.put("绘梨衣",new Integer(30000));
		ID.put("楚子航", new Integer(10000));
		ID.put("诺诺", new Integer(10000));
		System.out.println("请输入你的ID");
		Scanner CardID=new Scanner(System.in);
		 String name=CardID.next();
		 System.out.println("你要取多少钱");
			Scanner s=new Scanner (System.in);
			int a=s.nextInt();
	if (ID.containsKey(name)) {
		int i=((Integer)ID.get(name)).intValue();
		int b=i-a;
		if(b<0) {
			System.out.println("您的余额不足");
		}else {
		System.out.println("您的余额为"+b);
		}
	}else {
		System.out.println("没有此ID");
	}
	}
	}
		


