package learning.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LearningMapAndKey {
	
	public static void main (String srgs[])
	{
		String company= "Infosys Limited";
		System.out.println(company);
		company = company.toUpperCase();
		System.out.println(company);
		
		char[] charArray = company.toCharArray();
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for(char eachChar : charArray)
		{
			System.out.print(" "+eachChar);
			if(map.containsKey(eachChar))
				map.put(eachChar, map.get(eachChar)+1);
			else
				map.put(eachChar, 1);
			
		}
		System.out.println("\n");
		System.out.println(map);
		System.out.println(map.size());
		
		// find the most occurance value as home work
	}
	
}
