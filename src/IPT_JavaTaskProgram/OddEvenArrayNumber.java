package IPT_JavaTaskProgram;

public class OddEvenArrayNumber {

	static int[] number = {5,86,7,3,15,88,6,9,33,24,2,10,11,98};

	void evenNumbers() {
		int countEven =0,evenNumber=0;
		System.out.println("Even Numbers ");
		for(int i=0;i<number.length;i++) {
			if(number[i]%2==0) {
				evenNumber =number[i];
				countEven++;
				System.out.println(evenNumber);
			}
		}
		System.out.println("Count of Even Numbers :" + countEven);
	}

	void oddNumbers() {
		int countOdd =0,oddNumber=0;
		System.out.println("Odd Numbers  ");
		for(int i=0;i<number.length;i++) {
			if(!((number[i]%2)==0)) {
				oddNumber=number[i];
				countOdd++;
				System.out.println(oddNumber);
			}
		}
		System.out.println("Count of Odd Numbers  :" + countOdd);
	}

	public static void main(String[] args) {	
		OddEvenArrayNumber od =new OddEvenArrayNumber();
		od.evenNumbers();
		od.oddNumbers();
	}
}