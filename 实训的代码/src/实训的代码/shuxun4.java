package 实训的代码;
import java.util.Scanner;
public class shuxun4 {

	public static void main(String[] args) {
		System.out.println("请输入一个数");
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
			System.out.println("是回文数");
		}else {
			System.out.println("不是回文数");
		}
		
	}

}
