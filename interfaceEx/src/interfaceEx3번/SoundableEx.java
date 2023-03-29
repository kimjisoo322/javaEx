package interfaceEx3번;

public class SoundableEx {
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
	
	public static void printSound(Soundable soundable) {
		//soundable.sound();
		System.out.println(soundable.sound());
	}

	
}
