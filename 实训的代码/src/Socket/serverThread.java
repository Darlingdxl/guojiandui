package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.Socket;

public class serverThread extends Thread{
    Socket socket=null;
    public serverThread(Socket socket) {
    	this.socket=socket;
	}

	
		
		public void run() {
			InputStream is=null;
			InputStreamReader isr=null;
			BufferedReader br=null;
			OutputStream os=null;
			PrintWriter pw=null;
			try {
				is=socket.getInputStream();
				isr=new InputStreamReader(is);
				br=new BufferedReader(isr);
				String info="";
				while((info=br.readLine())!=null) {
					System.out.println("我是服务器，客服端说;"+info);
					
				}
				socket.shutdownInput();
				
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
