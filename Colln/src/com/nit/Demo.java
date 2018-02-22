package com.nit;

public class Demo {

	int i=10;
	Demo()
	{
		E e=new E(this);
	}
	
	
	public static void main(String[] args) {
	
		Demo d=new Demo();
		d.m1();
	}
public Demo m1()
{
	System.out.println("hai");
	return this;
}
}

class E
{
	public Demo r;
public	E(Demo r)
{
	System.out.println(r);
	System.out.println(r.m1());
}
}