package chapter19;
import java.util.*;
class Address{
	 private String Name;
	 private String Street;
	 private String City;
	 private String State;
	 private String Code;
	 Address(String n,String s,String c,String st,String cd){
		 Name=n;
		 Street=s;
		 City=c;
		 State=st;
		 Code=cd;
	 }
	 public String toString() {
		 return Name+"\n"+Street+"\n"+City+" "+State+" "+Code;
	 }
}
public class MailList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Address> m1=new LinkedList<Address>();
		m1.add(new Address("Farzaneh","Sharifvaghefi","Esfahan","Esfahan","258457125"));
		m1.add(new Address("Fariba","Lahour","Esfahan","Esfahan","1245879"));
		m1.add(new Address("Amir","Neshat","Esfahan","Esfahan","7854698"));
		for(Address element:m1)
			System.out.println(element+"\n");
		System.out.println();

	}

}
