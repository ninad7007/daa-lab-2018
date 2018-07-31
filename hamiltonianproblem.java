import java.util.*;
class hamiltonianp
{
  private int adj[][],x[],n;
  public hamiltonianp()
  {
  	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no of nodes");
	n=sc.nextInt();
	x=new int[n];
	x[0]=0;
	for(int i=1;i<n;i++)
	{
	  x[i]=-1;
	}

 	adj=new int[n][n];
	System.out.println("enter the adjacency matrix");
	for(int i=0;i<n;i++)
	{
	  for(int j=0;j<n;j++)
	  {
	     adj[i][j]=sc.nextInt();
	  }
  	}
   }
 public void nextvalue(int k)
 {
	int i=0;	
	while(true)
	{
	  x[k]=x[k]+1;
	  if(x[k]==n)
	   {
                x[k]=-1;
	   }
      	if(x[k]==-1)
	{
	   return;
	}
  	if(adj[x[k-1]][x[k]]==1)
	{
	  for(i=0;i<k;i++)
	  {
   	     if(x[i]==x[k])
	      {
	          break;
	       }
	 }
 	if(i==k)
	{
	  if(k<n-1||k==n-1&&adj[x[n-1]][0]==1)
	    {
	      return;
	     }
	}
      }
   }
 }
 public void hamiltonian(int k)
 {
	while(true)
	{
	  nextvalue(k);
	  System.out.println("\n value of k and x[k] is"+k);
 	   if(x[k]==-1)
	   {
	     return;
	    }
	if(k==n-1)
	{
	  System.out.println("\n solution");
	  for(int i=0;i<n;i++)
           {
	     System.out.print((x[i]+1)+"");
            }
  	System.out.println(1);
        }
   else hamiltonian(k+1);
   }
 }
}
 class hamiltonianproblem
{
	public static void main(String args[])
	{
 	  hamiltonianp obj=new hamiltonianp();
           obj.hamiltonian(1);
 	 }
 }
