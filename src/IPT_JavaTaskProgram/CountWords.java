package IPT_JavaTaskProgram;

import java.util.Scanner;

public class CountWords {
	String quote;int i;
	String[] quoteWordSplit;
	void StringWords()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the quotes");
		quote=sc.nextLine();
		System.out.println(quote);
		quoteWordSplit = quote.split(" ");
	}
	void CountWords(){
		this.StringWords();
		System.out.println("=========CountWords=============");
		System.out.println("Quotes length : " + quoteWordSplit.length);
		for (String word:quoteWordSplit) {
			System.out.println(word);
		}
	}
	void countLetters(){
		this.CountWords();
		System.out.println("========CountLetters============");
		for(String letters:quoteWordSplit) {
			int countLength = letters.length();
			//System.out.println(countLength);
			System.out.println("Total letters in " + letters+" : " + countLength);
		}
		
		/*for(int j=0;j<quoteWordSplit.length;j++) {
			String letters =quoteWordSplit[j];
			int countLength = letters.length();
			System.out.println("Total letters in " + quoteWordSplit[j]+" : " + countLength);
		}*/
	}

	public static void main(String[] args) {
		CountWords counts =new CountWords();
		counts.countLetters();
	}

}
