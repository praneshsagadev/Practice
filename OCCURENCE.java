package tasks;

 class OccurenceOfLettersFinal {

	public static void main(String[] args) {

		String str = "Selenium";

		str = str.toLowerCase();

		while (str.length() > 0) {

			int startLength = str.length();

			char ch = str.charAt(0);

			// String stCh = Character.toString(ch);

			String stCh = String.valueOf(ch);

			str = str.replace(stCh, "");

			int replacedLength = str.length();

			int finLength = startLength - replacedLength;

			// System.out.println("THE CHARACTER " + stCh + " OCCURS " + finLength + "
			// times");

			System.out.println(stCh + " - " + finLength);
			System.out.println(stCh + " - " + finLength);

			// System.out.println(str);

		}
		// System.out.println(str.length());

	}

}
