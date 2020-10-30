package chapter19;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Double> hs=new HashMap<String,Double>();
		hs.put("John Doe",3434.34);
		hs.put("Tom Smith", 123.22);
		hs.put("Jane Baker",1378.00);
		hs.put("Tod Hall", 99.22);
		hs.put("Ralph Smith",-19.8);
		Set<Map.Entry<String,Double>> set=hs.entrySet();
		for(Map.Entry<String, Double>me:set) {
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}
		System.out.println();
		double balance=hs.get("John Doe");
		hs.put("John Doe", balance+1000);
		System.out.println("John Doe is new balance : "+hs.get("John Doe"));
	}

}
