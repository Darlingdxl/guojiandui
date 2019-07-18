package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class client2 {

	public static void main(String[] args) {
		try {
			Socket s=new Socket("10.10.20.191",8080);
			OutputStream os=s.getOutputStream();
			PrintWriter pw=new PrintWriter(os);
			pw.write("用户名：annie;密码：1111");
			pw.flush();
			s.shutdownOutput();
			InputStream is =s.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
			String info="";
			while((info=br.readLine())!=null) {
				System.out.println("我是客户端，服务器说："+info);
				
			}
			br.close();
			is.close();
			pw.close();
			os.close();
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
