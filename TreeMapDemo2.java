package chapter19;
import java.util.*;
class Tcomp2 implements Comparator<String>{
	public int compare(String aStr2,String bStr2) {
		int i, j , k;
		i=aStr2.lastIndexOf(' ');
		j=bStr2.lastIndexOf(' ');
		k=aStr2.substring(i).compareToIgnoreCase(bStr2.substring(j));
		if(k==0)
			return aStr2.compareToIgnoreCase(bStr2);
		else
			return k;
	}


	}

public class TreeMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Double> tm3=new TreeMap<String,Double>(new Tcomp2());
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
