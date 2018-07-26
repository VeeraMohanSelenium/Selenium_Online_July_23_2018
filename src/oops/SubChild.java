package oops;

public class SubChild extends ObjectClass {

	public void hi() {
		System.out.println("Hello i am Subchild method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubChild s = new SubChild();
		s.test1();

		s.hi();
		System.out.println(s.a);

	}

}
