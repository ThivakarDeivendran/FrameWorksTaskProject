package IPT_JavaTaskProgram;

import java.util.Scanner;

public class StringPalindrome {
	static void reverseStringBuffer(String a){
		StringBuffer name =new StringBuffer(a);
		StringBuffer newName = name;
		StringBuffer reverseName =name.reverse();
		System.out.println(((newName).equals(reverseName))? newName + " is a Palindrome": newName + " is not a Palindrome");
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the teacher :");
		String teacher =sc.nextLine();
		String tempTeacher =teacher;
		String reverseTeacher="";
		for(int i=teacher.length()-1;i>=0;i--) {
			reverseTeacher=reverseTeacher + teacher.charAt(i);
		}
		if(reverseTeacher.equals(tempTeacher)) {
			System.out.println(teacher + " is a Palindrome");
		}else {
			System.out.println(teacher + " is not a Palindrome");
		}
		reverseStringBuffer(teacher);
		urlReplaceMethod();
	} 
	static void urlReplaceMethod(){
		String url ="https://www.w3schools.com/python/default.asp";
		if(url.contains("python")) {
			String newUrl =url.replace("python", "java");
			if(!newUrl.equalsIgnoreCase(url)) {
				System.out.println("Replace() method in string class working successfully");
				System.out.println(newUrl);
			}else {
				System.out.println("Replace() method not working");
			}
		}
		else {
			System.out.println("url Mis-match");
		}
	}	
}
