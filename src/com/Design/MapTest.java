package com.Design;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapTest {

	public static void main(String[] args) {
		
		//String str="I am sandeep and i am a developer Sandeep";
		String str="IamsandeepandiamadeveloperSandeep";
		
		String str2=str.toLowerCase();
		
		char[] cs = str2.toCharArray();
		
		
		Map<Character,Integer> m= new HashMap<>();
		//String []word=str2.split(" ");
		
		for(int i=0;i<cs.length;i++) {
		
			if(m.containsKey(cs[i])) {
			m.put(cs[i], m.get(cs[i])+1);
			}
			else
				m.put(cs[i], 1);
		}
		
		for(Map.Entry<Character, Integer> entry:m.entrySet()) {
			System.out.println(entry.getKey()+"--"+entry.getValue());
		}

		System.out.println("------------------------------");
		
		// To sort the Map according to value
		
		HashMap<Character, Integer> hm = m.entrySet().stream().sorted((i1,i2)->i1.getValue().compareTo(i2.getValue()))
		                                 .collect(Collectors.toMap(Map.Entry::getKey,
				                          Map.Entry::getValue,
				                         (e1,e2)->e1,LinkedHashMap::new));
		
		for(Map.Entry<Character, Integer> entry:hm.entrySet()) {
			System.out.println(entry.getKey()+"--"+entry.getValue());
		}
	}

}
