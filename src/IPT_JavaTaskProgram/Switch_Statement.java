package IPT_JavaTaskProgram;
import java.util.Scanner;
public class Switch_Statement {
	public static void weekDays(int value) {
		switch (value) {
		case 1: System.out.println("Selected day is Sunday");break;
		case 2: System.out.println("Selected day is Monday");break;
		case 3: System.out.println("Selected day is Tuesday");break;
		case 4: System.out.println("Selected day is Wednesday");break;
		case 5: System.out.println("Selected day is Thrusday");break;
		case 6: System.out.println("Selected day is Friday");break;
		case 7: System.out.println("Selected day is Saturday");break;
		default: System.out.println("INVALID day selection");break;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the month ");
		String month =scan.next();
		System.out.println("Enter the WeekdayNumber ");
		int value =scan.nextInt();
		switch (month) {
		case "january":
			System.out.println("Selected month is January");
			weekDays(value);break;	
		case "febuary":
			System.out.println("Selected month is Febuary");
			weekDays(value);break;
		case "march":
			System.out.println("Selected month is March");
			weekDays(value);break;
		case "april":
			System.out.println("Selected month is April");
			weekDays(value);break;
		case "may":
			System.out.println("Selected month is May");
			weekDays(value);break;
		case "june":
			System.out.println("Selected month is June");
			weekDays(value);break;
		case "july":
			System.out.println("Selected month is July");
			weekDays(value);break;
		case "august":
			System.out.println("Selected month is August");
			weekDays(value);break;
		case "september":
			System.out.println("Selected month is September");
			weekDays(value);break;
		case "october":
			System.out.println("Selected month is October");
			weekDays(value);break;
		case "november":
			System.out.println("Selected month is November");
			weekDays(value);break;
		case "december":
			System.out.println("Selected month is December");
			weekDays(value);break;
		default:
			System.out.println("INVALID month");

		}

	}

}
