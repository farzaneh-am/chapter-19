package chapter19;
import java.util.*;
public class PropDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties capitals=new Properties();
		capitals.put("Illinois", "Springfield");
		capitals.put("Missouri", "Jefferson City");
		capitals.put("Washington", "Olympia");
		capitals.put("Callifornia", "Sacramento");
		capitals.put("Indiana", "Indianapolis");
		
		
Set<?> states=capitals.keySet();
for(Object name:states) 
	System.out.println("the capital of "+name+" is "+capitals.getProperty((String)name)+".");
	System.out.println();
	String str_3=capitals.getProperty("Florida","Not Found");
	System.out.println("the capital of Florida is "+str_3+".");

}
}
