package Exam;

public class hg extends father {
	
	public void abc() {
		System.out.println("inside child");
	}
	
	public static void main(String[] args) {
		grandfather object = new grandfather();
		object.abc();
		
		grandfather object1 = new father();  // object1 has all properties of hg2 class; also whatever is written on right hand side, its function is being v=called
		object1.abc();
		
		hg object2= new hg();
		object2.abc();
		
	}
}


class father  extends grandfather {
	
	@Override
	public void abc() {
		System.out.println("inside father");
	}
}
class grandfather {
	public void abc() {
		System.out.println("inside grandfather");
	}

}