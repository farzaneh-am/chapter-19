package chapter19;

import java.util.*;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> adq=new ArrayDeque<String>();
		adq.push("A");
		adq.push("B");
		adq.push("D");
		adq.push("E");
		adq.push("F");
		System.out.print("poping the stack"+"\t");
		while(adq.peek() !=null)
			System.out.print(adq.pop()+"");
		System.out.println();
	
	}

}
