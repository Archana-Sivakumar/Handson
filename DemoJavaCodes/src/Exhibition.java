
public class Exhibition {
	void exhibit(Animal a) {
		if (a instanceof Snake) {
			Snake s1 = (Snake) a;
			s1.livingThing();
			s1.sound();
			s1.mobility();
		}

		else if (a instanceof Dog) {

			Dog d1 = (Dog) a;
			d1.livingThing();
			d1.sound();
			d1.mobility();
		}
	}
}
