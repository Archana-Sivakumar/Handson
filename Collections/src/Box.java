
public class Box {
	private int length;
	private int breadth;
	private int height;
	private int volume;

	public Box(int length, int breadth, int height, int volume) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
		this.volume = volume;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public int hashCode() {

		int volume = length * breadth * height;
		return volume;
	}

	@Override
	public boolean equals(Object obj) {
		Box other = (Box) obj;
		int volume = length * breadth * height;
		int otherVolume = other.length * other.breadth * other.height;
		if (volume != otherVolume) {
			return false;
		}
		return true;
	}

}
