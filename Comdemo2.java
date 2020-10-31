package chapter19;
import java.util.*;
public class Comdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts3=new TreeSet<String>((aStr,bStr) ->bStr.compareTo(aStr) );
		ts3.add("C");
		ts3.add("A");
		ts3.add("B");
		ts3.add("E");
		ts3.add("F");
		ts3.add("D");
		for(String element:ts3)
			System.out.print(element+" ");
		System.out.println();

	}

}
