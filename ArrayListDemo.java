package chapter19;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> a1=new ArrayList<String>();

System.out.println("initial size of a1: "+a1.size());
a1.add("C");
a1.add("A");
a1.add("E");
a1.add("B");
a1.add("D");
a1.add("F");
a1.add(1,"A2");
System.out.println("size of a1 after additions: "+a1.size());
System.out.println("contents of a1: "+a1);
a1.remove("F");
a1.remove(2);
System.out.println("size of a1 after deletion: "+a1.size());
System.out.println("contents of a1: "+a1);
	}

}
