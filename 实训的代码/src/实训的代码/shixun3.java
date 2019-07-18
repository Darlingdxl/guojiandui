package 实训的代码;
import java.util.Scanner;
public class shixun3 {

	public static void main(String[] args) {
		System.out.println("请输入字符");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] cha=s.toCharArray();
		int c=0;
		for(int i=0;i<s.length();i++) {
			if (cha[i]=='e') {
				c=c+1;
				
			}
			
		}
System.out.println(c);
	}

}
