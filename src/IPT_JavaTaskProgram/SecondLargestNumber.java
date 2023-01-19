package IPT_JavaTaskProgram;

import java.util.Arrays;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int secondNumber=0,thirdNumber=0;
		int []amount = {5,50,10,100,75,36,1,89,19,78};
		Arrays.sort(amount);
		/*for(int i=0;i<amount.length;i++) {
		secondNumber=amount.length-2;
		thirdNumber =amount.length-3;
	}*/
		System.out.println("Second largest Number is  " + amount[amount.length-2]);
		System.out.println("Third Largest Number is  "  + amount[amount.length-3]);
	}

}






