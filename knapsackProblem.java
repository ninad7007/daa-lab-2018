


import java.util.Scanner;
class knapsackproblem{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.println("\n\nenter the maximum capacity");
int m=input.nextInt();
System.out.println("\n\nenter the no of items");
int n=input.nextInt();
System.out.println("\n\nenter the weight of each items");
int w[]=new int[n+1];
w[0]=0;
for(int i=1;i<=n;i++)
{
System.out.println("weight of item"+i);
w[i]=input.nextInt();
}
System.out.println("\n\nenter the profit of each items");
int p[]=new int[n+1];
p[0]=0;
for(int i=1;i<=n;i++)
{
System.out.println("profit of item"+i);
p[i]=input.nextInt();
}
System.out.println("\n\n\nRunning dynamic knapsack....");
dynamicKnapsack problemOne=new dynamicKnapsack();
problemOne.runKnapsack(m,n,w,p);///////?????????????????????????????????????????????????????/
System.out.println("\n\n\nRunning greedy knapsack....");
greedyKnapsack problemTwo=new greedyKnapsack();
problemTwo.runKnapsack(m,n,w,p);
}
}
class dynamicKnapsack{
public void runKnapsack(int m,int n,int w[],int p[]){
int v[][]=new int[n+1][m+1];
for(int i=0;i<=n;i++)
{
for(int j=0;j<=m;j++)
{
if(i==0||j==0)
{
v[i][j]=0;
}
else if(w[i]>j)
{
v[i][j]=v[i-1][j];
}
else
{
if(v[i-1][j]>(p[i]+v[i-1][j-w[i]]))
{
v[i][j]=v[i-1][j];
}
else
{
v[i][j]=p[i]+v[i-1][j-w[i]];
}
}
}
}
System.out.println("maximum profit is -"+v[n][m]);
int selected[]=new int[n+1];
for(int i=0;i<n+1;i++)
{
selected[i]=0;
}
int i=n;
int j=m;
while(i>0&&j>0)
{
if(v[i][j]!=v[i-1][j])
{
selected[i]=1;
j=j-w[i];
}
i--;
}
System.out.println("items in knapsack:");
for(int k=0;k<=n;k++)
{
if(selected[k]==1)
{
System.out.println("item"+k+"\t");
}
}
System.out.println("\n\n\n\n");
}
}
class greedyKnapsack{
public void runKnapsack(int m,int n,int w[],int p[])
{
int maxindex=-1;
double remaining=(double)m;
double x[]=new double[n+1];
for(int i=0;i<=n;i++){
x[i]=0.0;
}
int i,k;
for(i=1;i<=n;i++)
{
double maxElement=0.0;
for(k=1;k<=n;k++)
{
if(maxElement<((double)p[k]/(double)w[k]) && x[k]==0.0)
{
maxElement=(double)p[k]/(double)w[k];
maxindex=k;
}
}
if(w[maxindex]>remaining)
{
break;
}
remaining=remaining-w[maxindex];
x[maxindex]=1;
}
if(i<=n)
{
x[maxindex]=remaining/w[maxindex];
}
double maxValue=0.0;
System.out.println("items included:");
for(int j=1;j<=n;j++)
{
if(x[j]!=0)
{
System.out.println("item"+j+"("+x[j]+")"+"\t");
maxValue=maxValue+(p[j]+x[j]);
}
}
System.out.println("\nmaximum profit:"+maxValue);
System.out.println("X array-");
for(i=1;i<=n;i++)
{
System.out.println(x[i]);
}
}
}







