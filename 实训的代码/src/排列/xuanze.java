package ееап;

import java.util.Arrays;

public class xuanze {

	public static void main(String[] args) {
	   int  a[]= {11,44,12,67,34,78,111,55};
	    for(int i=0;i<a.length;i++) {
	    	int minidex=i;
	    	for(int j=i;j<a.length;j++) {
	    		if(a[j]<a[minidex]) {
	    			minidex=j;
	    		}
	    	}
	    	int m=a[minidex];
	    	a[minidex]=a[i];
	    	a[i]=m;
	    }
	    System.out.println(Arrays.toString(a));
	}
}
