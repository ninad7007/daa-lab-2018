import java.util.Scanner;

public class student 
{
	int usn;
	String name,branch,phno;
	static Scanner sc = new Scanner(System.in);

	public static void getdata(student s,int i)
	{
		System.out.println("Enter the data of student no" +(i+1));
		System.out.println("Enter the name:");
		s.name=sc.next();
		System.out.println("usn:");
		s.usn=sc.nextInt();
		System.out.println("branch:");
		s.branch=sc.next();	
		System.out.println("phno");
		s.phno=sc.next();
	}
	public static void printdata(student s)
	{
		System.out.println(s.name+'\t'+s.branch+'\t'+s.usn+'\t'+s.phno);
	}

	public static void main(String[] args)
	{
		int lim,i;
		System.out.println("Enter the no of students:");
		lim=sc.nextInt();
		student s[]=new student [lim];
		for(i=0;i<lim;i++)
		{
			s[i]=new student();
			s[i].getdata(s[i],i);
		}
		for(i=0;i<lim;i++)
		{
			s[i].printdata(s[i]);
		}
	}
}
