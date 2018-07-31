import java.io.*;
import java.util.Scanner;
import java.util.Random;
import java.lang.*;

class mergesort{
	int []a = new int[20000];
	public void mergesort(int a[],int y)
	{
		int []b = new int[20000];
		int []c = new int[20000];
		int k,w=0;
		if(y>1)
		{
			for(int i=0;i<(y/2);i++)
			{
				b[i]=a[i];
			}
	
			mergesort(b,y/2);
			k=y-(y/2);
			for(int i=(y/2);i<y;i++,w++)
			{
				c[w]=a[i];
			}
			mergesort(c,k);
			merge(a,b,c,y);
		 }
	}


	public void merge(int a[],int b[],int c[],int y)
	{
		int i=0,j=0,k=0;
		int z=y-(y/2);
		while(i<(y/2)&&j<z)
		{
			if(b[i]<c[j])
			{
				a[k]=b[i];
				i++;
			}
			else
			{
				a[k]=c[j];
				j++;
			}
			k++;
		}
		while(i<(y/2))
		{
			a[k]=b[j];
			j++;
			k++;
		}
	}

	public static void main(String args[])
	throws Exception
	{
		int z=0;
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		long start;
		long end;
		FileWriter writer = new FileWriter("outM.txt");
		BufferedWriter bwr = new BufferedWriter(writer);
		mergesort x = new mergesort();
		for(int n=5000;n<=10000;n=n+100)
		{
			for(int i=0;i<n;i++)
			{		
				 x.a[i]=rand.nextInt(1000);
			}
			start = System.nanoTime();
			x.mergesort(x.a,n);
			end = System.nanoTime();
			bwr.write(Integer.toString(n));	
			bwr.write("\t");
			bwr.write(Long.toString(end-start));
			bwr.write("\n");
		}
		bwr.close();
	}
}
