package com.nit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArrayList1<E>
{
	private int initialCapacity;
	public transient Object[] elementData=new Object[initialCapacity];
	int size=0;
	int modCount=0;
	public ArrayList1(int initialCapacity)
	{
		super();
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Illegal Capacity: "+
                                               initialCapacity);
    this.elementData = new Object[initialCapacity];
    
    }
 public ArrayList1()
 {
	 this(10);
 }
 public boolean add(E e) {
	    ensureCapacity(size + 1);  // Increments modCount!!
	    elementData[size++] = e;
	    return true;
	    }
	 
	 
	 
	    public void ensureCapacity(int minCapacity) {
	    modCount++;
	    int oldCapacity = elementData.length;
	    if (minCapacity > oldCapacity) {
	        Object oldData[] = elementData;
	        int newCapacity = (oldCapacity * 3)/2 + 1;
	            if (newCapacity < minCapacity)
	        newCapacity = minCapacity;
	            // minCapacity is usually close to size, so this is a win:
	            elementData = Arrays.copyOf(elementData, newCapacity);
	    }
	    }
}

public class ArrayListInternal {

	public static void main(String[] args) {
		
		ArrayList1 u=new ArrayList1();
		u.add(10);
		
	}

}
