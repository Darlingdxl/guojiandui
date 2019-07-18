package ÊµÑµµÄ´úÂë;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class shixun7 {
	
	
    public static  void main(String[] args ) {
    	long maxsize=0;
    	long minsize=Integer.MAX_VALUE;
        File maxfile=null;
        File minfile=null;
        File f=new File("C:/Windows");
        File[] fis=f.listFiles();
        System.out.println(Arrays.toString(fis));
        
        for (File file:fis) {
        	if(file.isFile()) {
        		if(file.length()>maxsize) {
        		  maxsize=file.length();	
        		  maxfile=file;
        	}
        	   if(file.length()<minsize && file.length()!=0) {
        		   minsize=file.length();
        		   minfile=file;
        	   }
        		   
        	   }
        }
    System.out.println(maxfile);
    System.out.println(minfile);
      
        
	}
	}


