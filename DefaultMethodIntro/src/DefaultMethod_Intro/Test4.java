package DefaultMethod_Intro;

interface IA{
 public	default void m1() {
		System.out.println("m1() in IA");
	}
}

interface IB extends IA{
	default void m2() {
		System.out.println("m2() in IB");
		m1();
	}
	
	public default void m1() {
		System.out.println("m1() is Overriding in IB");
	}
}
public class Test4 implements IB {
	public static void main(String[] args) {
		IB ib=new Test4();
		ib.m1();
		ib.m2();
		
	}
}
