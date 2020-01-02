
public class StringExample {

	public static void main(String[] args) {
		String str = "Hello";
		String str1 = "Hello";
		String str2 = "Java";
		String str3 = "Hello Java!Welcome to Java!";
		char[] str4 = { 'W', 'e', 'l', 'c', 'o', 'm', 'e' };
		String str5 = "";

		char result = str.charAt(0);
		System.out.println("Index 0 value of result is:" + result);

		System.out.println("Compare two strings:" + str.compareTo(str1));

		System.out.println("Concat two strings:" + str.concat(str2));

		System.out.println("checks s in str:" + str.contains("s"));

		System.out.println("Uppercase value:" + str2.toUpperCase());

		System.out.println("Lowercase value:" + str1.toLowerCase());

		System.out.println("Replace l with p in str1:" + str1.replace('l', 'p'));

		System.out.println("Length of str1:" + str1.length());

		System.out.println("checks two strings to be equal:" + str.equals(str1));

		System.out.println("index value of Java is:" + str3.indexOf("Java"));

		str5 = str5.copyValueOf(str4, 0, 7);
		System.out.println("Copy the content of str4 to str5:" + str5);
	}

}
