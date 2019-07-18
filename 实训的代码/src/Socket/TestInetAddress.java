package Socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {

	public static void main(String[] args) {
		try {
		
			InetAddress address = InetAddress.getLocalHost();
			System.out.println("计算机："+address.getHostName());
			System.out.println("IP地址"+address.getHostAddress());
			byte[] bytes = address.getAddress();
			System.out.println(address);
			//根据机器名获取InetAddress实例
			InetAddress address2 = InetAddress.getByName("LAPTOP-0GC76FSK");
			System.out.println("计算机："+address2.getHostName());
			System.out.println("IP地址"+address2.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
