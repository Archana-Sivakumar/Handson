
public class Room {
	int length;
	int breadth;
	int height;
	int roomNo;
	String color;

	Room(int length, int breadth, int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
		int floorArea = length * breadth;
		int wallArea = (2 * length * height) + (2 * breadth * height);
		int paintingCost = wallArea * 2;
		System.out.println("Floorarea is:" + floorArea);
		System.out.println("PaintingCost is:" + paintingCost);
	}

	Room(int length, int breadth, int height, int roomNo) {
		this(length, breadth, height);
		this.roomNo = roomNo;
	}

	Room(int length, int breadth, int height, int roomNo, String color) {
		this(length, breadth, height, roomNo);
		this.color = color;
	}
}
/*
 * int calculateFloorArea(){ int floorArea=length*breadth; return floorArea; }
 * int calculatePaintCost(){ int wallArea=(2*length*height)+(2*breadth*height);
 * int paintingCost=wallArea*2; return paintingCost; }
 */
