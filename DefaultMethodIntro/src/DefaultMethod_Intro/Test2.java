package DefaultMethod_Intro;

interface I11{
	
	default void mm1() {
		System.out.println("mm1()1 in I11");
	}
	
	default void mm2() {
		System.out.println("mm2() in I11");
		mm1();
	}
	
	//default boolean equals(Object object) could not not 
}

class A implements I11{}


public class Test2 {
	public static void main(String[] args) {
		A a=new A();
		a.mm1();
		a.mm2();
	}

}
