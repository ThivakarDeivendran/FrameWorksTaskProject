package IPT_JavaTaskProgram;

public class StringStringBuffer {
	public static void main(String[] args) {
		String name1 ="Thivakar";
		String name2 ="Thivakar";
		String name3 = new String ("Thivakar");
		String name4 = new String (name2);
		StringBuffer name5 = new StringBuffer ("Thivakar");
		StringBuffer name6 = new StringBuffer ("Thivakar");
		System.out.println("name1 == name2 : " + (name1 == name2));
		System.out.println("name1.equals(name2) : " + name1.equals(name2));
		System.out.println("name1 == name3 : " + (name1 == name3));
		System.out.println("name3 == name4 : " + (name3 == name4));
		System.out.println("name4 == name2 : " + (name4 == name2));
		System.out.println("name5 == name6 : " + (name5 == name6));
		System.out.println("name2.equals(name3) : " + name2.equals(name3));
		System.out.println("name2.equals(name5) : " + name2.equals(name5));
		System.out.println("name3.equals(name5) : " + name3.equals(name5));
		System.out.println("name3.equals(name4) : " + name3.equals(name4));
		System.out.println("name5.equals(name6) : " + name5.equals(name6));
	}

}
