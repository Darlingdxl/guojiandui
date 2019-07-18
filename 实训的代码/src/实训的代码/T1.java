package ÊµÑµµÄ´úÂë;

public class T1 extends Thread {
        private boolean timeout=false;
        public void run() {
        	for(int i=0;i<20;i++) {
        		System.out.println("-----t1------"+i);
        	}
        }
	public void stopThread1() {
		timeout=true;
	}

}
