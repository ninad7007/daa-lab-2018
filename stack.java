import java.util.Scanner;

public class stack
{
	static int top=-1;
	static int max=100;	
	int choice;
	static Scanner sc = new Scanner(System.in);
	static int s[] = new int[max];
	
	public static void push()
	{
		int i,val;
		if(top>=max)
			System.out.println("Overflow!\n");
		else
		{	
			System.out.println("Enter number:\n");
			val = sc.nextInt();
			s[++top] = val;
		}
	}

	public static void pop()
	{
		int x;
		if(top==-1)
			System.out.println("Underflow!\n");
		else
		{
			x=s[top--];
			System.out.println("popped element="+x);
		}
	}

	public static void display()
	{
		int i;
		if(top<=-1)
		System.out.println("Underflow!\n");
		else
		{
			for(i=top;i>=0;i--)
				System.out.println(s[i]);
		}
	}

	public static void main(String args[])
	{
		stack s1=new stack();
		int choice;
		for(;;)
		{
			System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit\n");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1: s1.push();
					break;

				case 2: s1.pop();
					break;

				case 3: s1.display();
					break;

				case 4: System.exit(0);
					break;

				default: System.out.println("Invalid!\n");
			}

		}
	}
}
