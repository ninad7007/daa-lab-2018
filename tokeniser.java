import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.lang.*;
import java.util.StringTokenizer;

class tokeniser {
	public static void main(String args[ ]) {
		String name, date;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name");
		name = sc.nextLine();
		System.out.println("Enter Date Of Birth In The Form: dd/mm/yyyy");
		date = sc.next();

		System.out.print("\t" + name);
		StringTokenizer st = new StringTokenizer (date,"/");

		while( st.hasMoreElements() ) {
			System.out.print(", " + st.nextElement() );

		}
	}
}


