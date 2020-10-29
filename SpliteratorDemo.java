package chapter19;
import java.util.*;
public class SpliteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> vals=new ArrayList<>();
		vals.add(1.0);
		vals.add(2.0);
		vals.add(3.0);
		vals.add(4.0);
		vals.add(5.0);
		System.out.println("contents of vals:\n ");
		Spliterator<Double> spliter=vals.spliterator();
		while(spliter.tryAdvance((n)->System.out.println(n)));
		System.out.println();
		spliter=vals.spliterator();
		ArrayList<Double> sqrs=new ArrayList<>();
		while(spliter.tryAdvance((n)->sqrs.add(Math.sqrt(n))));
		System.out.println("contents of sqrs:\n ");
		spliter=sqrs.spliterator();
		spliter.forEachRemaining((n) -> System.out.println(n));
		System.out.println();

	}

}
