
public class ClassRoom extends Room {
	String boardcolor;

	ClassRoom(int length, int breadth, int height) {
		super(length, breadth, height);
	}

	ClassRoom(int length, int breadth, int height, int roomNo) {
		super(length, breadth, height, roomNo);
	}

	ClassRoom(int length, int breadth, int height, int roomNo, String color, String boardcolor) {
		super(length, breadth, height, roomNo, color);
		this.boardcolor = boardcolor;
		System.out.println("RoomNo is:" + roomNo);
		System.out.println("Room color is:" + color);
		System.out.println("Boardcolor is:" + boardcolor);
	}
}
