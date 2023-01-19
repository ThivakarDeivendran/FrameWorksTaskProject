package IPT_JavaTaskProgram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListIterator extends ListSetArray {
	static List<Double> decimalValue ;
	static java.util.ListIterator<Double> iter ;
	
	
	static void forwardIterator() {
		 decimalValue.listIterator();
		while(iter.hasNext()) {
			Double doubleValue = iter.next();
			System.out.println(doubleValue);
		}
	}
//	static void listIterator() {
//		decimalValue.listIterator();
//		 while(listIterator.hasNext()) {
//			 System.out.println(listIterator);
//		 }
//	}
	static void previousListIterator() {
		decimalValue.listIterator();
		 while(iter.hasPrevious()) {
			 System.out.println(iter.hasPrevious());
			 }
	}
	static void listMethod() {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(4);
		list.add(8);
		list.add(12);
		list.add(4);
		list.add(2);
		System.out.println(list);
		java.util.ListIterator<Integer> listIterator =list.listIterator();
		while(listIterator.hasNext()) {
			Integer listNext = listIterator.next();
			System.out.println(listNext);
		}
		System.out.println("Array list  in reverse order ");
		while(listIterator.hasPrevious()) {
			Integer listPrevious = listIterator.previous();
			System.out.println(listPrevious);
		}		
	}
	public static void main(String[] args) {
		decimalValue =new LinkedList<Double>();
		decimalValue.add(56.56);
		decimalValue.add(75.75);
		decimalValue.add(11.11);
		decimalValue.add(36.36);
		decimalValue.add(56.36);
		decimalValue.add(89.98);
		System.out.println(decimalValue);
		
		forwardIterator();
		System.out.println("bfdjfnjkd");
		previousListIterator();
			
		//listMethod();
	}
	/*public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(4);
		list.add(8);
		list.add(12);
		list.add(4);
		list.add(2);
		
		java.util.ListIterator<Integer> name =list.listIterator();


	}*/
	

}
