package com.Design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


class Person{
	private String name;
	private String city;
	private int age;
	
	public Person(String name, String city, int age) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		int hash = 1;
		hash = 79 * hash  + Objects.hashCode(this.name);
		hash = 79 * hash  + Objects.hashCode(this.city);
		hash = 79 * hash  +this. age;
		return hash ;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
	    if (!city.equals(other.city))
			return false;
	    if (!name.equals(other.name))
			return false;
		return true;
	}
	

	@Override
	public String toString() {
		return "[name=" + name + ", city=" + city + ", age=" + age + "]";
	}
	
	
}


public class MapInterview {

	public static void main(String[] args) {
		
		List<Person> list= new ArrayList<>();
		
		list.add(new Person("John","London",21));
		list.add(new Person("Swann","London",21));
		list.add(new Person("kevin","London",23));
		list.add(new Person("Monbo","Tokyo",23));
		list.add(new Person("Sam","Paris",23));
		list.add(new Person("Nadal","Paris",31));
		
		Map<String,List<Person>>personByCity= new HashMap<>();
		
		for(Person p:list) {
			if(!personByCity.containsKey(p.getCity())) {
				personByCity.put(p.getCity(), new ArrayList<>());
			}
			personByCity.get(p.getCity()).add(p);
		}
		
		System.out.println("Person Group By Cities are: " + personByCity);
		
		
		/*// Using java8 group by city
		personByCity=list.stream().collect(Collectors.groupingBy(Person::getCity));
		System.out.println(personByCity);
		
		
		Map<Integer, List<Person>>personByAge= new HashMap<>();
		
		// Using java8 group by Age
		personByAge=list.stream().collect(Collectors.groupingBy(Person::getAge));
		System.out.println(personByAge);
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
