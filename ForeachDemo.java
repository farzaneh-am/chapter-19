package chapter19;
import java.util.*;
public class ForeachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> vals=new ArrayList<Integer>();
		vals.add(1);
		vals.add(2);
		vals.add(3);
		vals.add(4);
		vals.add(5);
		System.out.println("contents of vals: ");
		for(int v:vals)
			System.out.print(v+" ");
		System.out.println();
		int sum=0;
		for(int v:vals)
			sum+=v;
		System.out.println("sum of values: "+sum);
			
		

	}

}
