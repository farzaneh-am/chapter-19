package chapter19;
import java.util.*;
public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<String,Double> tm=new TreeMap<String,Double>();
tm.put("John Doe",3434.34);
tm.put("Tom Smith", 123.22);
tm.put("Jane Baker",1378.00);
tm.put("Tod Hall", 99.22);
tm.put("Ralph Smith",-19.8);
Set<Map.Entry<String,Double>> set=tm.entrySet();
for(Map.Entry<String, Double>me2:set) {
	System.out.print(me2.getKey()+":");
	System.out.println(me2.getValue());
}
System.out.println();
double balance2=tm.get("John Doe");
tm.put("John Doe", balance2+1000);
System.out.println("John Doe is new balance : "+tm.get("John Doe"));

}
	}


