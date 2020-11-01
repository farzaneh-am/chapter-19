package chapter19;
import java.util.*;
public class StackDemo {
	static void showpush(Stack<Integer>st,int a) {
		st.push(a);
		System.out.println("push("+a+")");
		System.out.println("stack: "+st);
	}
	
	static void showpop(Stack<Integer>st,int a) {
	System.out.print("pop ->");
		Integer b=st.pop();
		System.out.println(b);
		System.out.println("stack: "+st);
			
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<Integer>();
		System.out.println("stack: "+st);
		showpush(st,42);
		showpush(st,66);
		showpush(st,99);
		showpop(st, 0);
		showpop(st, 0);
		showpop(st, 0);
		try {
			showpop(st, 0);
		}catch(EmptyStackException e) {
			System.out.println("Empty Stack");
		}
		
	}

}
