import java.util.*;
import java.io.*;

class DijkstraProgs
{
	public static void printDistance(int dis[], int src, int n)
	{
		for(int i=0;i<n;i++)
			System.out.println("\nDistance form " + src + "to t" + i + "is" + dis[i]);
	}
	
	public static void algorithm(int adg[][], int src, int n, int dist[], int par[], int vis[])
	{
		int u = -1,v,i,j,miu;
		for(i=0;i<n;i++)
		{
			if(adg[src][i]!=999 && vis[i]==0)
			{
				dist[i] = adg[src][i];
				par[i] = src;
			}	
		}
		for(i=1;i<n;i++)
		{
			int min = 999;
			for(j=0;j<n;j++)
			{
				if(dist[j]<min && vis[j]==0)
				{
					min = dist[j];
					u=j;
				}
			}
			vis[u] = 1;
			for(v=0;v<n;v++)
			{
				if(dist[u] + adg[u][v] < dist[v] && vis[v]==0)
				{
					dist[v] = dist[u] + adg[u][v];
					par[v] = u;
				}
			}
		}
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of vertices:");
		int n = sc.nextInt();
		int adg[][] = new int[n][n];
		int vis[] = new int[n];
		int par[] = new int[n];
		int dist[] = new int[n];
		System.out.println("\nEnter the graph:");
		for(int i = 0; i<n; i++)
			for(int j = 0 ; j<n; j++)
				adg[i][j] = sc.nextInt();
		System.out.println("\nThe graph:");
		for(int i=0; i<n; i++)
		{
			System.out.println(" ");
			for(int j=0; j<n; j++)
				System.out.println(adg[i][j] + "\t");
		}
		System.out.println("\nEnter the source:");
		int src = sc.nextInt();
		int i;
		for(i=0;i<n;i++)
		{
			dist[i] = 999;
			par[i] = -1;
			vis[i] = 0;
		}	
		vis[src] = 1;
		par[src] = -1;
		dist[src] = 0;
		algorithm(adg,src,n,dist,par,vis);
		printDistance(dist,src,n);
		
	}	
}
