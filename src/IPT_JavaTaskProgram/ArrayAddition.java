package IPT_JavaTaskProgram;

import java.util.Arrays;

public class ArrayAddition {
	public static void main(String[] args) {
		//number();
		int[][] number1 = {{45,8,7},{23,64,88},{13,0,11}};
		int number2[][]= {{29,12,6},{31,79,7},{21,2,91}};
		int []total[] = new int[number1.length][number2.length];

		for(int i =0;i<number1.length;i++) {
			for(int a=0;a<number2.length;a++) {
				total[i][a]=number1[i][a] + number2[i][a];
				System.out.print(total[i][a] + " ");
			}
			System.out.println();
		}  

	}
	public static void main(Character[] args) {
		System.out.println('a');
	}
  public static void main(Boolean[] args) {
		System.out.println(true);
	}
	
	public static void number() {
		int nu[] = { 8, 56, 47, 7, 9, 2, 0 };
		Arrays.sort(nu);
		for(int a : nu) {
			System.out.println(a);
		}

	}
}
