package com.Design;

import java.util.*;
public class OptionalTest {

	public static void main(String[] args) {
		
		String str=null;
		
		//In java7 we are using this to check null
		/*if(str==null) {
			System.out.println("Nullabe Object");
		}
		else
			System.out.println(str.length());
		*/
		
		//In java 8 we can do this to check null
		
		Optional<String> opt=Optional.ofNullable(str);
		
		System.out.println(opt.isPresent());
		//System.out.println(opt.get());
		
		System.out.println(opt.orElse("No value in this object"));
		
		
		
		
		
		
		
		
		
	}

}
