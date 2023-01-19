package IPT_JavaTaskProgram;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedCharacterProgram {
	public static void main(String[] args) {
		String word="wherethereisawillthereisaway";
		char wordcharacter[] =word.toCharArray();
		Map<Character,Integer> wordMap= new HashMap<Character, Integer>();
		for(char ch:wordcharacter ) {
			if(wordMap.containsKey(ch)) {
				wordMap.put(ch, wordMap.get(ch)+1);
			}else {
				wordMap.put(ch, 1);
			}
		}
		System.out.println(wordMap);
		
		System.out.println("Duplicate characters");
		Set<Entry<Character, Integer>> wordSet = wordMap.entrySet();
		for(Entry<Character, Integer> entry:wordSet) {
			if(entry.getValue()>1) {
				Character key = entry.getKey();
				Integer value = entry.getValue();
				System.out.println(key+"="+ value);
			}
		}
		
		test();
		
	}
	public static void test(){
		String[] name = {"Thivakar","Rajan","Ramavani","Thivakar","Rajan"};
		Map<String, Integer> nameMap =new HashMap();
		for(String eachName : name) {
			if(!nameMap.containsKey(eachName)) {
				nameMap.put(eachName, 1);
			}else {
				nameMap.put(eachName,nameMap.get(eachName)+1);
			}
		}
		System.out.println(nameMap);
		System.out.println("Duplicate words");
		Set<Entry<String,Integer>> nameSet =nameMap.entrySet();
		for(Entry<String,Integer> entry:nameSet) {
			if(entry.getValue()>1) {
				String key = entry.getKey();
				Integer value = entry.getValue();
				System.out.println(key+"  =" + value);
			}
		}

	}

}
