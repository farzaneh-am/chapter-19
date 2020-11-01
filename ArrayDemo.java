package chapter19;
import java.util.*;
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[10];
		for(int i=0;i<10;i++) 
	
		array[i]=-3*i;
		System.out.print("Original contents: ");
		display(array);
		Arrays.sort(array);
		System.out.print("Sorted: ");
		display(array);
		Arrays.fill(array,2,6,-1);
		System.out.print("after fill(): ");
		display(array);
		Arrays.sort(array);
		System.out.print("after Sorted again: ");
		display(array);
		System.out.print("the valu -9 is at location ");
		int index=Arrays.binarySearch(array ,-9);
				System.out.println(index);
}

	private static void display(int[] array) {
		// TODO Auto-generated method stub
		for(int i:array)
			System.out.print(i+" ");
		System.out.println();
		
	}
}
