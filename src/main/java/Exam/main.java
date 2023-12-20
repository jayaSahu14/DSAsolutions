package Exam;

 class BaseClass {
	  public void print() {
	    System.out.println("This is the print() method from the BaseClass class.");
	  }
	}

	 class ChildClass extends BaseClass {
	  @Override
	  public void print() {
	    System.out.println("This is the print() method from the Child class.");
	  }
	}

	public class main {
	  public static void main(String[] args) {
	    BaseClass obj = new ChildClass();
	    obj.print(); // This will print "This is the print() method from the child class."
	  }
	}