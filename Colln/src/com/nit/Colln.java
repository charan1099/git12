package com.nit;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Colln {

	public static void main(String[] args) {
		Employee e1 = new Employee();
        Employee e2 = new Employee();
 
        e1.setId(100);
        e2.setId(100);
    e1.setSname("charan");
    e1.setId(21);
    e2.setSname("charan");
    e2.setId(21);
 
        //Prints 'true'
        System.out.println(e1.equals(e2));
        System.out.println(e1.hashCode()+"    "+e2.hashCode());
 
        Set<Employee> employees = new HashSet<Employee>();
        employees.add(e1);
        employees.add(e2);
         
        //Prints two objects
        System.out.println(employees);
	}

}
class Employee
{
	private int id;
	private String sname;
	private int add;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAdd() {
		return add;
	}
	public void setAdd(int add) {
		this.add = add;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + add;
		result = prime * result + id;
		result = prime * result + ((sname == null) ? 0 : sname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (add != other.add)
			return false;
		if (id != other.id)
			return false;
		if (sname == null) {
			if (other.sname != null)
				return false;
		} else if (!sname.equals(other.sname))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", sname=" + sname + ", add=" + add + "]";
	}

	
	
}