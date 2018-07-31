import java.util.Scanner;

class stack
{
	Static Scanner sc = new Scanner(System.in);

	public int push(int a[],int top,int ele)
	{	
		if(top==4)	
			return top;
		top=top+1;
		a[top]=ele;
		return top;
	}
	
	public int pop(int a[],int top)
	{
		if(top==-1)
		return top;
		else
		{
			int ele;
			ele=a[top];
			System.out.println("popped element"+ele);
			top=top-1;
			return top;	
		}
	}

	public void display(int a[],int top)
	{
		if(top==-1)
		return;
		for(int i=0;i<=top;i++)	
		System.out.println(a[i]+"\t");
	}
	
	public static void main(String args[])
	{
		int a[]=new int[100];
		int top=-1;
		int ch;
		int x,ele;
		Scanner scanner = new Scanner(System.in);
		stack obj = new stack();
		for(;;)
		{
			System.out.println("Stack\n1.Push\n2.Pop\n3.Display\n4.Exit");
			System.out.println("Enter the choice:\n");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:System.out.println("Enter the number to be pushed:\n");
					ele=sc.nextInt();
					top=obj.push(a,top,ele);
					break;
				
				case 2: System.out.println("popped");
					top=obj.pop(a,top);
					break;

				case 3: System.out.println("Display");
					obj.display(a,top);
					break;

				case 4: System.exit(0);
			}
		}
	}
}
