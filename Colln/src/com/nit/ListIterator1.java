package com.nit;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class ListIterator1 {

	public static void main(String[] args) {
		
		
		Set s=Collections.synchronizedSet(new HashSet());
		s.add(20);
		s.add(30);
		s.add(15);
		s.add(45);
		Iterator litr=s.iterator();
		while(litr.hasNext())
		{
			s.add(90);
			System.out.println(litr.next());
		
		}
	}

}

