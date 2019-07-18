package Socket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client1 {

	public static void main(String[] args) {
		try {
			Socket s=new Socket("10.25.43.36",8888);
			System.out.println("----与服务器端建立连接----");
			System.out.println("请输入");
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			bw.write(str);
			bw.flush();
			bw.close();
			s.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
