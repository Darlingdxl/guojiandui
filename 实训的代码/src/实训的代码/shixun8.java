package ʵѵ�Ĵ���;

import java.util.Collections;
import java.util.LinkedList;

public class shixun8 {

	public static void main(String[] args) {
LinkedList<String> link = new LinkedList<String>();
        
        link.add("apple");
        link.add("grape");
        link.add("banana");
        link.add("pear");
        System.out.println("����Ԫ��Ϊ"+Collections.max(link));
        System.out.println("��С��Ԫ��Ϊ"+Collections.min(link));
        
        Collections.sort(link);
        for(String s :link){
            System.out.println(s);


	}

	}
	}
