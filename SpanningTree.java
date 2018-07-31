import java.util.Scanner;
class SpanningTree
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of the graph ");
		int n = input.nextInt();
		int G[][] = new int[n][n];

		System.out.println("\n Enter graph ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			G[i][j] = input.nextInt();
			}
		}
		System.out.println("\n Entered graph");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			System.out.print(G[i][j] + "\t");
			}
		}
		System.out.println("\n\n\n Running Prim's Algorithm .... ");
		primsAlgorithm graphOne = new primsAlgorithm();
		graphOne.minimumCost(G,n);
	}
}

class primsAlgorithm
{
	Scanner input = new Scanner(System.in);
	int minimumCost(int G[][],int n)
	{
		int vertex=0;
		int min=9999;
		int cost=0;
		int u=0;
		int v=0;
		int visited[] = new int[n];
		for(int i=0;i<n;i++)
		{
			visited[i]=0;
		}
		visited[0]=1;
		vertex=vertex+1;
		while(vertex < n)
		{
			min=9999;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(visited[i]==1 && visited[j]==0 && G[i][j]<min)
					{
						u=i;
						v=j;
						min=G[i][j];
					}
				}	
			}
			if(visited[u]==1 && visited[v]==0)
			{
				visited[v]=1;
				cost=cost+min;
				vertex=vertex+1;
				System.out.println("Edge :"+u+"....("+min+")....."+v);
			}
		}
		System.out.println("Cost : "+cost);
		return cost;
	}
}

