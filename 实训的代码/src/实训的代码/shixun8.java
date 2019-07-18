package 实训的代码;

import java.util.Collections;
import java.util.LinkedList;

public class shixun8 {

	public static void main(String[] args) {
LinkedList<String> link = new LinkedList<String>();
        
        link.add("apple");
        link.add("grape");
        link.add("banana");
        link.add("pear");
        System.out.println("最大的元素为"+Collections.max(link));
        System.out.println("最小的元素为"+Collections.min(link));
        
        Collections.sort(link);
        for(String s :link){
            System.out.println(s);


	}

	}
	}
