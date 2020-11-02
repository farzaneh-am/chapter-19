package chapter19;
import java.util.*;
public class HTDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,Double> balance_2=new Hashtable<String,Double>();
	String str_2;
		double bal_2;
		balance_2.put("John Doe",3434.34);
		balance_2.put("Tom Smith", 123.22);
		balance_2.put("Jane Baker",1378.00);
		balance_2.put("Tod Hall", 99.22);
		balance_2.put("Ralph Smith",-19.8);
		Set<String> set_2=balance_2.keySet();
		Iterator<String> itr_2=set_2.iterator();
		while( itr_2.hasNext()) {
			str_2=itr_2.next();
			System.out.println(str_2+": "+balance_2.get(str_2));
			
		}
		System.out.println();
		bal_2=balance_2.get("John Doe");
		balance_2.put("John Doe",bal_2+1000);
		System.out.println("John Doe is new balance: "+balance_2.get("John Doe"));
	}

}
