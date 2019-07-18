package ÊµÑµµÄ´úÂë;

public class shixun4 {

	public static void main(String[] args) {
	
	int a[]=new int[10];
	for(int i=0;i<10;i++) {
	 a[i]=(int) (Math.random()*100);
	}
	int c=0;
	for(int i=0;i<10;i++) {
		for(int j=i+1;j<10;j++) {
			if (a[i]>a[j]) {
				c=a[i];
				a[i]=a[j];
				a[j]=c;
				
			}
		}
	}
	for(int i=0;i<10;i++) {
		System.out.print(a[i]+"    ");
	}
	}

}
