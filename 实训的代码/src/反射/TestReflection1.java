package ∑¥…‰;

import java.lang.reflect.Constructor;

public class TestReflection1 {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.name="lisa";
		System.out.println(h.name);
		
		try {
			Class pClass = Class.forName("Reflection.Hero");
			Constructor c = pClass.getConstructor();
			Hero h1 = (Hero)c.newInstance();
			h1.name="bad";
			System.out.println(h1.name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
