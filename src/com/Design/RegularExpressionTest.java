package com.Design;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
public class RegularExpressionTest {

	public static void main(String[] args) throws Exception {
		
		
		//To get all the email id
		//Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		//To get all the mobile no
		Pattern p = Pattern.compile("[0|91]?[7-9][0-9]{9}");
		
		PrintWriter pw= new PrintWriter("output.txt");
		BufferedReader br= new BufferedReader(new FileReader("abc.txt"));
		String line=br.readLine();
		
		while(line!=null) {
			Matcher m= p.matcher(line);
			while(m.find()) {
				pw.println(m.group());
			}
			line=br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();
	}

}
