package regularExpressions;

public class ProblemOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String text;
		
		//Extract only Alphabets
		text="TestLeaf(9876) Has Number of Employees .";
		System.out.println("Original Text: "+text);
		
		//Extract only Alphabets
		String replaceAll = text.replaceAll("\\d", "");
		String replaceAll2 = replaceAll.replaceAll("\\W", "");
		System.out.println("Extract Alphabets only:"+replaceAll2);
		
		//Extract only Numbers
		String replaceAll3 = text.replaceAll("\\D", "");
		System.out.println("Extract Numbers only:"+replaceAll3);
		
		//Extract Special Characters
		String replaceAll4 = text.replaceAll("\\d", "");
		String replaceAll5 = replaceAll4.replaceAll("[a-zA-Z]", "");
		System.out.println("Extract Special Characters only:"+replaceAll5);
		//Extract Special Characters only(removing spaces)
		String replaceAll6 = replaceAll5.replaceAll("\\s", "");
		System.out.println("Extract Special Characters only:"+replaceAll6);
	}

}
