package week7day2;

public class StringTec1 {

	public static void main(String args[]) {
	String name= "Abidharan";
	int length=name.length();
	System.out.print("original:" +name);
	System.out.println("");
	//Method1
	for(int i=length-1;i>=0;i--)
	{
		System.out.print(name.charAt(i));
	}
	
	//Method2
//	char[] cs = name.toCharArray();
//	for (char c : cs) {
//		
//		System.out.println(name.charAt(c));
//		
//	}
	
	//Method3
	StringBuilder build=new StringBuilder("Google");
	System.out.println("");
	System.out.println(build.reverse());
	
	
}
}