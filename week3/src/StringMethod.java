// Lab Practice #2
// 2024.03.18

public class StringMethod {
	
	// Returns the string created by adding 's2' after position 'index' of 's1'.
	static String addString(String s1, int index, String s2) {
				
		String pre = s1.substring(0, index + 1);
		String next = s1.substring(index + 1, s1.length());
		
		return pre + s2 + next;
	}
	
	// Returns reversed string of 's'
	static String reverse(String s) {
		
		String result = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			result += s.charAt(i);
		}
		
		return result;
	}
	
	// Return a string with all 's2''s removed from 's1'
	static String removeString(String s1, String s2) {
		
		if (s2.length() <= 0) {
			return s1;
		}
		
		String s = s1;
		int index = s.indexOf(s2);
		
		while (index != -1) {
			String pre = s.substring(0, index);
			String next = s.substring(index + s2.length(), s.length());
			s = pre + next;
			
			index = s.indexOf(s2);
		}
		
		return s;
	}
	
	
	public static void main(String[] args) {

		// 0123-456
		System.out.println(addString("0123456", 3, "-"));
		
		// cba
		System.out.println(reverse("abc"));
		
		// 0110
		System.out.println(removeString("01001000", "00"));

	}

}