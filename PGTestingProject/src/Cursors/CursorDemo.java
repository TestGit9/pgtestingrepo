package Cursors;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorDemo {

	public static void main(String[] args) {

		
		//Internal Implementations of Cursors:
		
				Vector v = new Vector();
				
				Enumeration e=v.elements();
				
				Iterator itr=v.iterator();
				
				ListIterator litr=v.listIterator();
				
				System.out.println(e.getClass().getName());
				
				System.out.println(e.getClass().getClassLoader());
				
				System.out.println(itr.getClass().getName());
				
				System.out.println(litr.getClass().getName());
				
				System.out.println(litr.getClass().getClassLoader());
				
				/*Cursors:
		         * 
		         * If we want to get Objects one by one from collection then we should go for Cursors
		         * These are 3 Types of Cursors Available in JAVA
		         *         Enumerations
		         *         Iterator
		         *         ListIterator
				 * 
				 * 
				 */
	}

}
