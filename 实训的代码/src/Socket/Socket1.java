package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Socket1 {

	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(8888);
			System.out.println("¼àÌýÔÚ¶Ë¿ÚºÅ£º8888");
			Socket s=ss.accept();
			InputStream is=s.getInputStream();
			int msg=is.read();
			System.out.println("¼àÌýµ½"+msg);
			is.close();
			s.close();
			ss.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
