package Cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {

		
Vector v=new Vector();
		
		for(int i=0;i<=10;i++) {
		
			v.addElement(i); 
		}
		System.out.println(v);
				
		Enumeration e=v.elements();  //v is  vector object
		
		while(e.hasMoreElements()) {
			
		Integer I=(Integer)e.nextElement();	
	
		if(I%2==0) {
			System.out.println(I);
		}
		System.out.println(v);
		}
				
		
		/* 
		 * 
		 * Enumeration:
		 * We can Use Enumeration to get Objects one by one from the Collection
		 * We can Create Enumeration Object b using elements()
		 *           public Enumerations elements();
		 * 
		 * Methods:
		 * public boolean hasMoreElements()
		 * public Object nexttElements();
		 * 
		 * Limitations of Enumerations:
		 * Enumerations concept is Applicable only for Legacy classes and it is Not a Universal cursor
		 * By using Enumeration we can perform only Read operation and we can't perform Remove opeartion 
		 * to over come these Above limitations we should go for Iterator
		 * */	
	}

}
