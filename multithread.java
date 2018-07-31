import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.lang.*;

class square extends Thread{
	int num;
	square(int n,String name){
		super(name);
		num=n;
		start();
	}
	public void run(){
		System.out.println(this.getName() + "\t SQUARE IS \t" + (int)Math.pow(num,2));
	}
}

class cube extends Thread{
	int num;
	cube(int n, String name){
		super(name);
		num=n;
		start();
	}
	public void run(){
		System.out.println(this.getName() + "\t CUBE IS \t" + (int)Math.pow(num,3));
	}
}

class randomgen extends Thread{
	int r;	
	randomgen(String name){
		super(name);
		start();
	}
	public void run(){	
		Random rand = new Random();
		while(true)
		{
			r=rand.nextInt(10);
			System.out.println(this.getName() + "\t Random Number is \t" + r);
			square s = new square(r,"Thread 1");
			cube c = new cube(r,"Thread 2");
			try{
				Thread.sleep(1000);
			}
			catch (InterruptedException e){
				System.out.println("Interrupted");
			}
		}
	}
}

class multithread{
public static void main(String args[]){
	randomgen d = new randomgen("RANDOM");
	}
}
