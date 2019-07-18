package ∑¥…‰;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflection {

	public static void main(String[] args) {
		Hero h = new Hero();
//		h.setName("sally");
//		System.out.println(h.getName());
		
		try {
			Method m = h.getClass().getMethod("setName", String.class);
			try {
				m.invoke(h, "lisa");
				System.out.println(h.getName());
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
}
}