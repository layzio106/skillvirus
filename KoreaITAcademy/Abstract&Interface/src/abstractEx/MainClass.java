package abstractEx;

import interfaceEx.Computer;
import interfaceEx.Television;

public class MainClass {

	public static void main(String[] args) {

		Computer publicComputer = new Computer("거실 컴퓨터");
		publicComputer.turnOn();
		publicComputer.turnOff();
		
		Computer myComputer = new Computer("내 컴퓨터");
		myComputer.turnOn();
		myComputer.turnOff();
		
		Television publicTV = new Television("거실 TV");
		publicTV.turnOn();
		publicTV.turnOff();
		
	}

}
