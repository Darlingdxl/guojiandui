import java.io.IOException;
import java.net.Socket;

public class Client1 {

	public static void main(String[] args) {
	   try {
		Socket s=new Socket("127.0.0.1",8888);
		System.out.println(s);
		s.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
