package chapter19;
import java.util.*;
class CompLastName implements Comparator<String>{
	public int compare(String aStr3,String bStr3){
		int i,j;
		i=aStr3.lastIndexOf(' ');
		j=bStr3.lastIndexOf(' ');
		return aStr3.substring(i).compareToIgnoreCase(bStr3.substring(j));
		
		
	}
}
class CompThenByFirstName implements Comparator<String>{
	public int compare(String aStr3,String bStr3){
		int i,j;
		
		return aStr3.compareToIgnoreCase(bStr3);
		
		
	}
	
	
}
public class TreeMapDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompLastName compLN=new CompLastName();
		Comparator<String>CompLastThenFirst=compLN.thenComparing(new CompThenByFirstName());
		TreeMap<String,Double> tm3=new TreeMap<String,Double>(CompLastThenFirst);
		tm3.put("John Doe",3434.34);
		tm3.put("Tom Smith", 123.22);
		tm3.put("Jane Baker",1378.00);
		tm3.put("Tod Hall", 99.22);
		tm3.put("Ralph Smith",-19.8);
		Set<Map.Entry<String,Double>> set=tm3.entrySet();
		for(Map.Entry<String, Double>me4:set) {
			System.out.print(me4.getKey()+":");
			System.out.println(me4.getValue());
		}
		System.out.println();
		double balance3=tm3.get("John Doe");
		tm3.put("John Doe", balance3+1000);
		System.out.println("John Doe is new balance : "+tm3.get("John Doe"));


	}

}
