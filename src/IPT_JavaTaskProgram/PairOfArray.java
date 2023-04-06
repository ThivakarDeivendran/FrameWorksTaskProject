package IPT_JavaTaskProgram;

public class PairOfArray {
	
	public static void main(String[] args) {
		int[] number = {0,1,2,3,4,5,6,7,8,9};
//		Scanner scannerVariable = new Scanner(System.in);
//		int targetValue =scannerVariable.nextInt();
		
		for(int i =0;i<number.length;i++ ) {
			//for(int j=i+1;j<number.length;j++) {
			int nu= number[i];
				if((nu+number[i])==8) {
					System.out.println("{" + number[i]+","+nu +"}");
				}
		}    
	}

}
