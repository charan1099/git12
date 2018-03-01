package com.nt.java;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person
{
	 int no;
	 String name;
     double sal;
     
	public Person(int no, String name, double sal) {
		super();
		this.no = no;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Person [no=" + no + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
	
}
public class Lam {

	public static void main(String[] args) {
		
		
		List<Person> per=new ArrayList<>();
		per.add(new Person(111,"charan",1200));
		per.add(new Person(112,"vinay",1300));
		per.add(new Person(113,"chari",1500));
		per.add(new Person(118,"somu",1100));
		
		//per.forEach((p)->System.out.println(p.no +" "+p.name));
		//per.add(2, new Person(1234,"ravi",1000));
		
		//per.forEach(System.out::println);
		
		Set<String> o=per.stream().filter(p->p.sal>1200).map(p->p.name+" "+p.no).collect(Collectors.toSet());
		System.out.println(o);
		
		/*DoubleSummaryStatistics d=per.stream().collect(Collectors.summarizingDouble(p->p.sal));
		
		System.out.println(d.getCount());*/
	}

}
