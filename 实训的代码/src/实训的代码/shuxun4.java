package ʵѵ�Ĵ���;
import java.util.Scanner;
public class shuxun4 {

	public static void main(String[] args) {
		System.out.println("������һ����");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		String str=s+"";
		System.out.print(str);
		
		char temp;
	    char[] a=str.toCharArray();
	    int i =str.length();
	    for (int j=i/2-1;j>=0;j--) {
	    	temp=a[j];
	    	a[j]=a[i-1-j];
	    	a[i-1-j]=temp;
	    }
	     String str1=new String(a);
		if(str1.equals(str)) {
			System.out.println("�ǻ�����");
		}else {
			System.out.println("���ǻ�����");
		}
		
	}

}
