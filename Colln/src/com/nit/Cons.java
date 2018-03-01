package com.nit;

public class Cons {

	public static void main(String[] args) {
		Gt s=new Hj(10,20);
		
		
	}

}
abstract class Gt
{
	Gt(int a,int b)
	{
		System.out.println(a+" "+b);
	}
	abstract void m1();
}
class Hj extends Gt
{

	Hj(int a, int b) {
		super(10,20);
		System.out.println("hai");
		
	}

	@Override
	void m1() {
		
		
	}
	
}
/*abstract class Gt{
	Gt()
	{
		System.out.println("parent cons");
	}
	public abstract void m1();
	
}
 class Rt extends Gt
 {
	 Rt()
	 {
		 System.out.println("child cons");
	 }

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
 }*/