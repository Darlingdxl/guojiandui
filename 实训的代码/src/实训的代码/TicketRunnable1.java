package ÊµÑµµÄ´úÂë;

public class TicketRunnable1  implements Runnable{
 private int tickets=50;
	@Override
	public void run() {
		while(true) {
		if(tickets>0) {
			System.out.println(Thread.currentThread().getName()+"is saling tickets"+tickets--);
		}else {
			break;
		}
		
	}
	}
}
