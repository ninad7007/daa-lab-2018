import java.util.*;
import java.io.*;

class TSP
{
	static int MAX = 100;
	public static int tspDP(int c[][], int tour[], int start, int n)
	{
		int i,j,k,minCost,cost;
		int[]  temp = new int[MAX];
		int[] minTour = new int[MAX];
		if(start ==(n-2))
			return(c[tour[n-2]][tour[n-1]]+c[tour[n-1]][0]);
		minCost=999;
		for(i=start+1;i<n;i++)
		{
			for(j=0;j<n;j++)
				temp[j]=tour[j];
			temp[start+1]=tour[i];
			temp[i]=tour[start+1];
			
			if(c[tour[start]][tour[i]]+(cost=tspDP(c,temp,start+1,n))<minCost)
			{
				minCost = (c[tour[start]][tour[i]]+cost);
				for(k=0;k<n;k++)
					minTour[k] = temp[k];
			}
		}
		for(i=0;i<n;i++)
			tour[i]=minTour[i];
		return minCost;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);	
		int n,i,j,minCost;
		int[][] c= new int[MAX][MAX];
		int[] tour = new int[MAX];
		System.out.println("Enter the number of cities:");
		n = sc.nextInt();		
		System.out.println("Enter the matrix:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
				c[i][j] = sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			tour[i] = i;
		}
		minCost = tspDP(c,tour,0,n);
		System.out.println("Min Cost" + minCost);
		System.out.println("Path\n");
		for(i=0;i<n;i++)
			System.out.print((tour[i]+1)+"\t");
		System.out.println("1");
	}
}
