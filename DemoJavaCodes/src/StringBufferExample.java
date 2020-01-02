
public class StringBufferExample {

	public static void main(String[] args) {
		String str = "Archana";
		String str1 = "Welcome";

		StringBuffer sb = new StringBuffer(str);
		sb.append(str1);
		System.out.println("append(str1):" + sb);

		sb.insert(2, str1);
		System.out.println("inserted value:" + sb);

		sb.replace(2, 5, str1);
		System.out.println("replaced value:" + sb);

		sb.reverse();
		System.out.println("reversed value:" + sb);

		sb.delete(2, 5);
		System.out.println("deleted value is:" + sb);
	}

}
