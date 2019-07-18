package Socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server2 {

	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(8080);
			int count=0;
			System.out.println("---服务器即将启动，等待客户连接---");
			while(true) {
				Socket s=ss.accept();
				serverThread st=new serverThread(s);
				st.start();
				count++;
				System.out.println("客户端的数量："+count);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
