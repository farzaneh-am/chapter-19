package chapter19;
import java.io.*;
import java.util.*;
public class phonebook {

	public static void main(String[] args) 
			throws IOException
	{
Properties ht=new Properties();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String name,number;
FileInputStream fin=null;
boolean changed=false;
try {
	fin=new FileInputStream("Phonebook.dat"); 
	}catch(FileNotFoundException e) {
				
			}
try {
	if(fin !=null) {
		ht.load(fin);
		fin.close();
	}
	
}catch(IOException e) {
	System.out.println("Error reading file. ");
}
do {
	System.out.println("Enter new Name"+"('quit' to stop): ");
name=br.readLine();
if(name.equals("quit")) continue;
System.out.println("Enter Number:" );
number=br.readLine();
ht.put(name, number);
changed=true;
}while(! name.equals("quit"));
if(changed) {
	FileOutputStream fout=new FileOutputStream("Phonebook.dat");
	ht.store(fout,"Telephon Book");
}
do {
	System.out.println("Enter Name tO Find"+"'quit' to quit(): ");
	name=br.readLine();
	if(name.equals("quit")) continue;
	number=(String) ht.get(name);
	System.out.println(number);
}while(! name.equals("quit"));
	}

}
