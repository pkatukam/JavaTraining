public class Anagram {

	public static void main(String[] args) {
		System.out.println("Parliament and Partial men is anagram "
				+ isAnagram("P(r)   li;am?ent", "Par'tial:' me,n"));
	}

	private static boolean isAnagram(String string, String string2) {
		String[] ignoreChracters = { ",", "\\?", "!", "\"", "-", ":", ";", "\\(",
				"\\)", " " , "'"};
		for (int i = 0; i < ignoreChracters.length; i++) {
			string = string.replaceAll(ignoreChracters[i], "");
			string2 = string2.replaceAll(ignoreChracters[i], "");
		}
		System.out.println(string.substring(0, 1));
		if (string.length() != string2.length())
			return false;

		int beginIndex = 0;
		int endIndex = beginIndex + 1;
		while (beginIndex != string.length()) {
			String str = string.substring(beginIndex, endIndex);
			if (string2.indexOf(str) < 0)
				return false;
			string2 = string2.replaceFirst(str, "");
			beginIndex++;
			endIndex++;
		}

		if (string2.isEmpty())
			return true;
		
		return false;
	}
}
