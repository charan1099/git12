package com.nit;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConPodUsingConcurrency {

	public static void main(String[] args) {
		BlockingQueue que=new LinkedBlockingQueue();
		new Thread(new Producer1(que)).start();
		new Thread(new Consumer1(que)).start();
		
	}

}
class Consumer1 implements Runnable{
	
private  final BlockingQueue queue;
	public Consumer1(BlockingQueue queue) {
		this.queue=queue;
	}

	@Override
	public void run() {
		while(true)
		{
			try{
				Thread.sleep(500);
				System.out.println("consumer is::"+queue.take());
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}
	
}
class Producer1 implements Runnable
{
	private  final BlockingQueue queue;
	public Producer1(BlockingQueue queue) {
		this.queue=queue;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			try{
				Thread.sleep(500);
				System.out.println("producer is::"+i);
				queue.put(i);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		
	}
	
}