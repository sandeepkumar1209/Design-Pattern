package com.Design;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
public class TestJava {

	public static void main(String[] args) {
	
		/*Map<String,Integer>map= new HashMap<>();
		map.put("ricky",1);
		map.put("rocky", 6);
		map.put("fisssy", 8);
		map.put("oz", 9);
		map.put("gig", 2);
		map.put("tom", 5);
		
		System.out.println(map);

		Set<String>set=map.keySet();
		System.out.println(set);
		
		Collection<Integer> values = map.values();
		System.out.println(values);
		
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+"---->"+entry.getValue());
		}
		System.out.println("======================================================");
		Set<Entry<String, Integer>> s1=map.entrySet();
		
		Iterator<Entry<String, Integer>> itr=s1.iterator();
		
		while(itr.hasNext()) {
			Entry<String, Integer> m=(Entry<String, Integer>) itr.next();
			System.out.println(m.getKey()+"----->"+m.getValue());
		}
		
		boolean containsKey = map.containsKey("gig");
		System.out.println(containsKey);
		*/
		
		
		
		/*Map<String,Integer>map1=new HashMap<>();
		map1.put("IC1", 1);
		map1.put("IC2", 2);
		map1.put("IC3", 3);
		
		Map<String,Integer>map2=new HashMap<>();
		map2.put("IC1", 4);
		map2.put("IC2", 5);
		map2.put("IC5", 1);
		
		
        Set<String> s1=map1.keySet();
        Set<String> s2=map2.keySet();
        
        System.out.println(s1);
        System.out.println(s2);
        
		
		Iterator<String> itr1=s1.iterator();
		Iterator<String> itr2=s2.iterator();
		
		while((itr1.hasNext()) && (itr2.hasNext())) {
			String m1= itr1.next();
			String m2=itr2.next();
			
			if(m1.equals(m2)) {
				System.out.println(m1);
			}
		
		*/
		
		HashSet<Integer>h1=new HashSet<>();
		h1.add(1);
		h1.add(2);
		h1.add(3);
		h1.add(4);
		h1.add(5);
		h1.add(6);
		System.out.println(h1);
		
		HashSet<Integer>h2=new HashSet<>();
		h2.add(1);
		h2.add(2);
		h2.add(9);
		h2.add(8);
		h2.add(5);
		h2.add(6);
		System.out.println(h2);
		
		h1.retainAll(h2);
		System.out.println(h1);
		
		Set<Integer>s=h1.stream().filter(h2::contains).collect(Collectors.toSet());
		System.out.println(s);
		
		Iterator<Integer> itr1=h1.iterator();
		Iterator<Integer> itr2=h2.iterator();
		
		while((itr1.hasNext()) && (itr2.hasNext())) {
			Integer I1= itr1.next();
			Integer I2= itr2.next();
			
			if(I1.equals(I2)) {
				System.out.println(I1);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}
}