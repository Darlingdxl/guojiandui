package ееап;

import java.util.Arrays;

public class chaxu {

	public static void main(String[] args) {
		int[]a= {2,3,5,9,66,4,33,88,44,22,11,7,8,99};
		  for (int i=1;i<a.length;i++) {
			  for (int j=i;j>0;j--) {
				  if(a[j]<a[j-1]) {
					  int m=a[j-1];
					  a[j-1]=a[j];
					  a[j]=m;
				  }
			  else {
				  break;
			  }
		  }
		}
     System.out.println(Arrays.toString(a));
	}
}

