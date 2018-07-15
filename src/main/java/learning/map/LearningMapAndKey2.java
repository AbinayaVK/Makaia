package learning.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LearningMapAndKey2 {
	
	public static void main (String srgs[])
	{
		String company= "Infosys Limited";
		System.out.println(company);
		company = company.toUpperCase();
		System.out.println(company);
		
		char[] charArray = company.toCharArray();
		for(char eachChar:charArray)
		{
			System.out.print(eachChar);
			//System.out.println((int)eachChar);
			System.out.println(((int)eachChar)+32);
			//System.out.println((char)eachChar);
			}
	}
	
}
