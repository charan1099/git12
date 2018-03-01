package com.nit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Deadlock1 {
	
	public static void main(String[] args) {
	Integer[] a={10,20,10,30};
	Integer[] b={10,40,50,20};
	List<Integer> m=new ArrayList(3);
	m.addAll(Arrays.asList(a));
	m.addAll(Arrays.asList(b));
System.out.println(m);
Set s=new HashSet();
s.addAll(m);
System.out.println("Set is"+s);
	
	
	
	}

}
