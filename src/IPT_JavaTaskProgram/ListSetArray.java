package IPT_JavaTaskProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListSetArray {
	public static void main(String[] args) {
		List <Integer> list = new ArrayList<Integer>();

		list.add(4);
		list.add(8);
		list.add(12);
		list.add(4);
		list.add(2);
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(4));
		System.out.println(list.size());
		System.out.println(list.set(1, 99));
		System.out.println(list.set(3, 0));
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		int index =list.indexOf(99);
		System.out.println(index);
		boolean contain = list.contains(0);
		System.out.println(contain);
		boolean isEmpty =list.isEmpty();
		System.out.println(isEmpty);

		list.clear();
		System.out.println(list);
		boolean isEmptyafter =list.isEmpty();
		System.out.println(isEmptyafter);

		list.add(4);
		list.add(8);
		list.add(12);
		list.add(4);
		list.add(2);
		System.out.println(list);
		List <Integer> list1 = new ArrayList<Integer>();
		System.out.println(list1.size());
		list1.add(41);
		list1.add(18);
		list1.add(42);
		list1.add(47);
		list1.add(82);
		System.out.println(list1.size());
		System.out.println(list1);
		list.addAll(list1);
		System.out.println(list.size());
		System.out.println(list1.size());
		System.out.println(list);
		System.out.println(list1);

		boolean retainAll = list.retainAll(list1);
		System.out.println(retainAll);
		System.out.println(list);
		System.out.println(list1);

		boolean listAll =list1.removeAll(list);
		System.out.println(listAll);
		System.out.println(list1);

		System.out.println(list);

		boolean listCompare =list.equals(list1);
		System.out.println(listCompare);

		Set<Integer> set  = new TreeSet<Integer>();
		set.add(22);
		set.add(33);
		set.add(44);
		set.add(55);
		set.add(33);
		set.add(55);
		System.out.println(set);
		System.out.println(set.size());

		set.add(66);
		System.out.println(set);
		System.out.println(set.size());

		set.remove(66);
		set.remove(33);
		System.out.println(set);

		boolean contain1 =set.contains(33);
		boolean contain2 =set.contains(44);
		System.out.println(contain1);
		System.out.println(contain2);
		boolean isEmpty2 =set.isEmpty();
		System.out.println(isEmpty2);
		//set.clear();

		Set<Integer> set1  = new TreeSet<Integer>();
		set1.add(222);
		set1.add(333);
		set1.add(444);
		set1.add(555);
		set1.add(333);
		set1.add(55);
		System.out.println(set1);
		System.out.println(set1.size());
		set.addAll(set1);
		System.out.println(set.size());


		System.out.println(set);
		System.out.println(set1);

		//set.retainAll(set1);
		System.out.println(set);
		set.removeAll(set1);
		System.out.println(set);
		System.out.println(set.equals(set1));

	}
}
