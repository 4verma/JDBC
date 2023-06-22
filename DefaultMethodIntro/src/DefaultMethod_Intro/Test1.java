package DefaultMethod_Intro;

interface I1{
	default  void show() {
		System.out.println("Show() in I1");
	}
}

interface I2{
	default  void show() {
		System.out.println("show() in I2");
	}
}

class Hello implements I1,I2{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show() in Hello");
	}
	
	void showAll() {
		System.out.println("ShowAll in Hello");
		show();
		I1.super.show();
		I2.super.show();
	}
	
}
public class Test1 {
	public static void main(String[] args) {
			Hello hello=new Hello();
			hello.showAll();
	}

}
