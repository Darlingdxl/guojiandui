package ʵѵ�Ĵ���;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;
public class shixun6 {
	

	public static void main(String[] args) {
		HashMap ID=new HashMap();
		ID.put("·����", new Integer(20000));
		ID.put("������",new Integer(30000));
		ID.put("���Ӻ�", new Integer(10000));
		ID.put("ŵŵ", new Integer(10000));
		System.out.println("���������ID");
		Scanner CardID=new Scanner(System.in);
		 String name=CardID.next();
		 System.out.println("��Ҫȡ����Ǯ");
			Scanner s=new Scanner (System.in);
			int a=s.nextInt();
	if (ID.containsKey(name)) {
		int i=((Integer)ID.get(name)).intValue();
		int b=i-a;
		if(b<0) {
			System.out.println("��������");
		}else {
		System.out.println("�������Ϊ"+b);
		}
	}else {
		System.out.println("û�д�ID");
	}
	}
	}
		


