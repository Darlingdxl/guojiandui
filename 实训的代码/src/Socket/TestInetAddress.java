package Socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {

	public static void main(String[] args) {
		try {
		
			InetAddress address = InetAddress.getLocalHost();
			System.out.println("�������"+address.getHostName());
			System.out.println("IP��ַ"+address.getHostAddress());
			byte[] bytes = address.getAddress();
			System.out.println(address);
			//���ݻ�������ȡInetAddressʵ��
			InetAddress address2 = InetAddress.getByName("LAPTOP-0GC76FSK");
			System.out.println("�������"+address2.getHostName());
			System.out.println("IP��ַ"+address2.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
