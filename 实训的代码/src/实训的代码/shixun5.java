package ÊµÑµµÄ´úÂë;
import java.util.LinkedList;
public class shixun5  extends LinkedList{
	public void put(Object o) {
		this.addLast(o);
	}
     public Object get() {
    	 Object o=this.getFirst();
    	 this.removeFirst();
    	 return o;
     }

	public static void main(String[] args) {
	shixun5 q =new shixun5();
	q.put("one");
	q.put("two");
	q.put("three");
	q.put("four");
	for(int i=0;i<4;i++) {	
	System.out.println(q);
	System.out.println(q.get());
}
	}

}
