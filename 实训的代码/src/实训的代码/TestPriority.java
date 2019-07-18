package 实训的代码;

public class TestPriority {

	public static void main(String[] args) {
		T1 t1=new T1();
		T2 t2=new T2();
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		System.out.println("t1的优先级："+t1.getPriority());
		System.out.println("t2的优先级："+t2.getPriority());
	}

}
