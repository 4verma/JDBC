package DefaultMethod_Intro;

interface Car{
	
public static final	Integer numberofairbag=6;

//This one calling as defender method or Virtual Method or Default Method 
 default  void carcolor() {
	 System.out.println("Default Car color is White ");
 }
	
	
}

public class Default_Method implements Car{
	public static void main(String[] args) {
	
	}
}
