import java.util.Scanner;
import java.io.*;
class Staff {
	String name, phone, id, salary;
	Scanner input = new Scanner(System.in);
	Staff(String i, String n, String p, String s) {
		name = n;
		salary = s;
		phone = p;
		id = i;
	}
	public void display() {
		System.out.println("\nName: " + name + "\nStaff ID: "
                     + id + "\nSalary: " + salary + "\nPhone: " + phone);
	}
}

class Teaching extends Staff
{
    String domain, publication;

	Teaching(String i, String n, String p, String s, String d,
                                                                            String pub) {
                super(i, n, p, s);
                publication = pub;
                domain = d;
    }

	public void display() {
		super.display();
        System.out.println("Publication: " + publication +
                            "\nDomain: " + domain);
    }
}


class Technical extends Staff {
    String skills;
    Technical(String i, String n, String p, String s, String sk) {
                super(i, n, p, s);
                skills = sk;
    }

    public void display() {

		super.display();
        System.out.println("Skills: " + skills);
    }
}



class Contract extends Staff {
    String period;
    Contract(String i, String n, String p, String s, String pe) {
            super(i, n, p, s);
            period = pe;
}

	public void display() {
		super.display();
        System.out.println("Period: " + period);
    }
}


class staffDemo{
	public static void main (String args []) {
		Scanner input = new Scanner(System.in);
		String id[] = new String[3];
		String name[] = new String[3];
		String phone[] = new String[3];
		String salary[] = new String[3];
		String domain[] = new String[3];
		String publication[] = new String[3];

		Teaching T1[] = new Teaching[3];
		System.out.println("\n\n Enter the details for teaching staff");

		for (int i = 0; i < 3; i++) {
             System.out.println("\n \n Teaching Staff no\n "+ (i+1));
			System.out.println("Enter Name");
			name[i] = input.nextLine();

			System.out.println("Enter ID");
			id[i] = input.nextLine();

			System.out.println("Enter Salary");
			salary[i] = input.nextLine();

			System.out.println("Enter phone number");
			phone[i] = input.nextLine();

			System.out.println("Enter domain");
			domain[i] = input.nextLine();

			System.out.println("Enter Publication");
			publication[i] = input.nextLine();

			T1[i] = new Teaching(id[i],name[i],phone[i],salary[i],
                                                      domain[i],publication[i]);

		}

		String skills[] = new String[3];
		Technical T2[] = new Technical[3];

        System.out.println("\n\n\n Enter the details for technical staff");
        for (int i = 0; i < 3; i++) {
             System.out.println("\n \n Technical Staff no\n "+ (i+1));
            System.out.println("Enter Name");
            name[i] = input.nextLine();

            System.out.println("Enter ID");
            id[i] = input.nextLine();

            System.out.println("Enter Salary");
            salary[i] = input.nextLine();

            System.out.println("Enter phone number");
            phone[i] = input.nextLine();

			System.out.println("Enter Skills");
			skills[i] = input.nextLine();

            T2[i] = new Technical(id[i],name[i],phone[i],salary[i],skills[i]);

        }



		String period[] = new String[3];
		Contract T3[] = new Contract[3];

		System.out.println("\n\n\n Enter the details for contract staff:");
		for(int i = 0; i < 3; i++) {
            System.out.println("\n\n Contract Staff no\n "+(i+1));
			System.out.println("\n Enter Name");
            name[i] = input.nextLine();

            System.out.println("Enter ID");
            id[i] = input.nextLine();

            System.out.println("Enter Salary");
            salary[i] = input.nextLine();

            System.out.println("Enter phone number");
            phone[i] = input.nextLine();

			System.out.println("Enter period");
			period[i]=input.nextLine();

			T3[i] = new Contract(id[i],name[i],phone[i],salary[i],period[i]);

		}

         System.out.println("\n Details of Teaching Staff:");
                    for(int i=0;i<3;i++)
                    T1[i].display();

          System.out.println("\n Details of Technical Staff:");
                    for(int i=0;i<3;i++)
                    T2[i].display();


     System.out.println("\n Details of Contract Staff:");
                    for(int i=0;i<3;i++)
                    T3[i].display();
	}
}


