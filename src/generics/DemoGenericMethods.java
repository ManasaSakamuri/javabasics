package generics;

import java.util.ArrayList;
import java.util.Iterator;



public class DemoGenericMethods {
	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();  
		list.add("rahul");  
		list.add("jai");  
		//list.add(32);//compile time error  
		  
		String s=list.get(1);
		System.out.println("element is: "+s);  
		  
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
		 

}
