package Socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {

	public static void main(String[] args) {
		  try {
				Socket s=new Socket("10.25.43.36",8888);
				OutputStream os=s.getOutputStream();
				System.out.println("ÇëÊäÈë Äú¼àÌýµ½µÄ");
				int a=new Scanner(System.in).nextInt();
				int  b=a;
				os.write(b);
				os.close();
				s.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
