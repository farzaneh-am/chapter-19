package chapter19;
import java.util.*;
public class AlgoritmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(-8);
		l1.add(20);
		l1.add(-20);
		l1.add(8);
		Comparator<Integer> r=Collections.reverseOrder();
		Collections.sort(l1,r);
		System.out.print("list sorted in reverse: ");
		for(int i:l1) 
			System.out.print(i+" ");
		System.out.println();
		Collections.shuffle(l1);
		System.out.print("list shuffled: ");
		for(int i:l1) 
			System.out.print(i+" ");
		System.out.println();
		System.out.println("Minimum: "+Collections.min(l1));
		System.out.println("Maximum: "+Collections.max(l1));
	}

}
