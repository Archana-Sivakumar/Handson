import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoxMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of boxes");
		int noOfBoxes = s.nextInt();

		int length;
		int height;
		int breadth;
		int volume;

		Set<Box> set = new HashSet<Box>();

		for (int i = 0; i < noOfBoxes; i++) {
			length = s.nextInt();
			breadth = s.nextInt();
			height = s.nextInt();
			volume = length * breadth * height;
			Box box = new Box(length, breadth, height, volume);
			set.add(box);
		}
		System.out.println("Unique boxes in the set are");
		for (Box box : set) {
			System.out.println("Length = " + box.getLength() + " Breadth = " + box.getBreadth() + " Height = "
					+ box.getHeight() + " Volume = " + box.getVolume());

		}
	}

}
