package PracticeSet;

public class PalindromeString {
	public static void main(String[] args) {
	 String s= "abcba";
	 String r=" ";
	 for(int i=s.length()-1;i>=0;i--) {
	 r=r+s.charAt(i);	 
	 }System.out.println(r);
		
//	 System.out.println(s.equals(r));
	 if(s.equals(r)) {
		 System.out.println("the string is palindrome");
	 }else {
		 System.out.println("The string is not palindrome");
	 }
	 
		
		
		
		
	}

}
