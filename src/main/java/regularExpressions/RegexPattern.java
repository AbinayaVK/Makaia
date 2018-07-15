package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPattern {

	public static void main(String[] args) {
		
		
		String text;
		String pattern;
		
		//For Pan card
		text="BPBPD2486N";
		pattern="[A-Z]{5}[\\d]{4}[A-Z]";
				
		
		//Results 
		Pattern p =Pattern.compile(pattern);
		Matcher m=p.matcher(text);
		System.out.println(m.matches());
	}

}
