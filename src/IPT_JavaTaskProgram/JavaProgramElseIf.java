package IPT_JavaTaskProgram;

import java.util.Scanner;

public class JavaProgramElseIf {
	public static void main(String[] args) {
		Scanner bloodValue= new Scanner(System.in);
		System.out.println("Enter the Blood value :");
		int readValue = bloodValue.nextInt();
		if(readValue >=50 && readValue <60 ) {
			System.out.println("Blood Group is AB+");
		}
		else if (readValue >=70 && readValue <80) {
			System.out.println("Blood Group is A+");
		}
		else if (readValue >=80 && readValue <90) {
			System.out.println("Blood Group is B+");
		}
		else if (readValue >=90 && readValue <100) {
			System.out.println("Blood Group is O+");
		}else {
			System.out.println("Blood Group is Negative value");
		}
	}

}
