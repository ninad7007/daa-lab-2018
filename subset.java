import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.lang.*;
class subset
{
   int n,m;
   int v=0;
int x[]=new int[10];
int w[]=new int[10];
public void sub(int s,int k,int r)
{
 x[k]=1;
if (s+w[k]==m)
 {
   v=v+1;
   System.out.print("\t subsets");
    for(int i=0;i<=k;i++)
    {
	if(x[i]==1)
	 {
	   System.out.print("\t"+w[i]);
	  }
	}
	System.out.println();
     }
else if(s+w[k]+w[k+1]<=m)
 {
   sub(s+w[k],k+1,r-w[k]);
  }
if((s+r-w[k]>=m)&&(s+w[k+1]<=m))
 {
   x[k]=0;
   sub(s,k+1,r-w[k]);
 }
}
public static void main(String args[])
 {
    subset obj=new subset();
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter the no of ele");
    obj.n=scanner.nextInt();
    int a[]=new int[obj.n];
    System.out.println("enter the ele");
     for(int i=0;i<obj.n;i++)
      {
         a[i]=scanner.nextInt();
       }
    System.out.println("enter the limit");
     obj.m=scanner.nextInt();
      for(int f=0;f<(obj.n)-1;f++)
	{
	  for(int i=0;i<((obj.n)-1-f);i++)
	  {
  	     if(a[i]>a[i+1])
	     {
	        int p=a[i];
	        a[i]=a[i+1];
	        a[i+1]=p;
	      }
	   }
	}
  int sum=0;
for(int i=0;i<(obj.n);i++)
 {
   obj.w[i]=a[i];
   sum=sum+a[i];
 }
 if(obj.n>sum)
  {
    System.out.println("no solution");
     return;
  }
 for(int i=0;i<(obj.n);i++)
  {
    obj.x[i]=0;
  }
 obj.sub(0,0,sum);
 if(obj.v==0)
 {
    System.out.println("no solution");
 }
  return;
}
} 
