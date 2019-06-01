package testing;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {

	public static void main(String[] args) {
		
		
		ArrayList obj= new ArrayList();
		
		obj.add(98989);
		obj.add('l');
		obj.add("Selenium");
		
		int size= obj.size();
		
		Iterator itr= obj.iterator();
		
		while(itr.hasNext())
			
		{
			
			Object abc= itr.next();
			System.out.println(abc);
		}

	}

}
