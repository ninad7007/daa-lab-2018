import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.lang.*;

class quicksort{
	Scanner input = new Scanner(System.in);
	public static void main(String args[]) throws Exception
	{
		int[]A=new int[500000];
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		long start;	
		long end;
		FileWriter writer= new FileWriter("out.txt");
		BufferedWriter bwr=new BufferedWriter(writer);
		quicksort x = new quicksort();
		for(int n=1000;n<=500000;n=n+500)
		{	
			for(int i=0;i<n;i++)
			{
				A[i] = rand.nextInt(1000);
			}	
		start=System.nanoTime();
		quicksort(A,0,n-1);
		end = System.nanoTime();
		bwr.write(Integer.toString(n));
		bwr.write("\t");
		bwr.write(Long.toString(end-start));
		bwr.write("\n");
		}
		bwr.close();
	}
	
	public static void quicksort(int []A, int f, int r){
		if(f<r)
		{
			int s = partition(A,f,r);
			quicksort(A,f,(s-1));
			quicksort(A,(s+1),r);
		}
	}
	
	static int partition(int []A,int f,int r)
	{
		int pivot = A[r];
		int i = (f-1);
		for(int j = f;j<=r-1;j++)
		{
			if(A[j]<=pivot)	
			{
				i++;
				int temp = A[i];
				A[i]=A[j];
				A[j]=temp;
			}
		}
		int temp = A[r];
		A[r]=A[i+1];
		A[i+1]=temp;
		return(i+1);
	}
}
