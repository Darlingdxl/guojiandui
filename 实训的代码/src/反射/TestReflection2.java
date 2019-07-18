package ∑¥…‰;

import java.lang.reflect.Field;

public class TestReflection2 {

	public static void main(String[] args) {
		Hero h = new Hero();
		try {
			Class pClass = Class.forName("Reflection.Hero");
			Field f1 = pClass.getDeclaredField("name");
			f1.set(h, "aaaa");
			System.out.println(h.name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
