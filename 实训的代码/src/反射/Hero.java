package 反射;

public class Hero {
	public int id;
	public String name;
	public int age;
	
	static String copyright;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static String getCopyright() {
		return copyright;
	}

	public static void setCopyright(String copyright) {
		Hero.copyright = copyright;
	}
	
	static {
		System.out.println("初始化copyright");
		copyright = "版权由xx公司所有";
    }
}