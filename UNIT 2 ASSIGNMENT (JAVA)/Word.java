import java.util.*;


class Word {
	static void WordStatus()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String : ");
		String ch = sc.next();
		//char[] c = ch.toCharArray();

		int count1 = 0,count2 = 0;

		for (int i = 0;i < ch.length();i++ ) {
			count1++;
			if ((ch.charAt(i) == 'A') || (ch.charAt(i) == 'E') || (ch.charAt(i) == 'I') || (ch.charAt(i) == 'O') || (ch.charAt(i) == 'U') || (ch.charAt(i) == 'a') || (ch.charAt(i) == 'e') || (ch.charAt(i) == 'i') || (ch.charAt(i) == 'o') || (ch.charAt(i) == 'u'))  {
				count2++;		
			}
		}

		System.out.println("The String contains " + count1 + " characters.");
		System.out.println("The String contains " + count2 + " vowels.") ;
	}

	public static void main(String[] args) {
		WordStatus();
	}
}