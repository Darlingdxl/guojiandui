package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class server1 {

	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(8888);
			System.out.println("---������������- - -");
			Socket s=ss.accept();
			System.out.println("�пͻ������ӣ�ip��"+s.getInetAddress().getHostAddress());
			BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			String str=br.readLine();
			System.out.println("�ͻ��˷�������Ϣ��"+str);
			br.close();
			s.close();
			ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
