package chapter19;
import java.util.*;
public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("C");
		a2.add("A");
		a2.add("E");
		a2.add("B");
		a2.add("D");
		a2.add("F");
		System.out.print("original contents of a2: ");
		Iterator<String> itr=a2.iterator();
		while(itr.hasNext()) {
			String element=itr.next();
			System.out.print(element+" ");
		}
System.out.println();
ListIterator<String> litr=a2.listIterator();
while(litr.hasNext()) {
	String element=litr.next();
	litr.set(element+" + ");
}
System.out.print("modified contents of a2: ");
itr=a2.iterator();
while(itr.hasNext()) {
	String element=itr.next();
	System.out.print(element+" ");
}
System.out.println();
System.out.print("modified list  backwards: ");
while(litr.hasPrevious()) {
	String element=litr.previous();
	System.out.print(element+" ");
}
System.out.println();

	}

}
