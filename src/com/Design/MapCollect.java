package com.Design;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;


class Emp{
	int eid;
	String name;
	String salary;


Emp(int eid,String name,String salary){
	this.eid=eid;
	this.name=name;
	this.salary=salary;
}

public int hashCode() {
	return eid;
}

public String toString() {
	return eid+"";
}
}

public class MapCollect {

	public static void main(String[] args) {
		
		Emp e1= new Emp(101,"A","1000");
		Emp e2= new Emp(102,"B","2000");
		Emp e3= new Emp(103,"C","3000");
		Emp e4= new Emp(104,"D","4000");
		Emp e5= new Emp(105,"E","5000");
		Emp e6= new Emp(106,"F","6000");
		Emp e7= new Emp(107,"G","7000");
		
		
		HashMap<Emp,String>h=new HashMap<>();
		h.put(e1, "a");
		h.put(e2, "b");
		h.put(e3, "c");
		h.put(e4, "d");
		h.put(e5, "e");
		h.put(e6, "f");
		h.put(e7, "g");
		
		System.out.println(h);
		
		for(Map.Entry<Emp, String> entry:h.entrySet()) {
			System.out.println(entry.getKey()+"--->"+entry.getValue());
		}
		
		
		// Converting Map to List
		
		List<Emp> keySet = h.keySet().stream().collect(Collectors.toCollection(ArrayList::new));
		// List<Emp> keySet=new ArrayList<>(h.keySet());

		List<String> value = h.values().stream().collect(Collectors.toCollection(ArrayList::new));
		// List<String> value=new ArrayList<>(h.values());

		// To get EntrySet

		 Set<Entry<Emp, String>>s=h.entrySet();
		 List<Entry<Emp, String>> entrySet=new ArrayList<Entry<Emp, String>>(s);

		 System.out.println(entrySet);

		 System.out.println(keySet);
		 System.out.println(value);

		
		  keySet.forEach (e->{
			  System.out.println(e);
			  });
		 
		 value.forEach(e->{
			 System.out.println(e);
			 });
		 
		// iterating the Map
		/* 
		Set<Emp> s = h.keySet();
		Collection<String> c = h.values();

		Set<Entry<Emp, String>> s1 = h.entrySet();
		Iterator<Entry<Emp, String>> itr = s1.iterator();

		while (itr.hasNext()) {
			Entry<Emp, String> entry = (Entry<Emp, String>) itr.next();
			System.out.println(entry.getKey() + "----->" + entry.getValue());
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
