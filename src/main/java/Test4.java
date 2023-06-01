import java.util.ArrayList;
import java.util.Iterator;

public class Test4 {
	
	public static void main(String[] args) {
	
	ArrayList<Integer> ar= new ArrayList<Integer>();
	
	ar.add(1);
	ar.add(2);
	ar.add(3);
	
//	System.out.print(ar);
	
	for(int i: ar) {
		System.out.println(i);
	}
	
	Iterator it= ar.iterator();	
	while(it.hasNext()) {
	System.out.println(it.next());}


}
}