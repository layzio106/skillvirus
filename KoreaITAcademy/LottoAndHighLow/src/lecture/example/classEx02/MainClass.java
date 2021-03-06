package lecture.example.classEx02;

public class MainClass {

	public static void main(String[] args) {
		
		Computer computer1 = new Computer("가족공용컴퓨터", "거실"); //매개변수가 있는 생성자 이용
		computer1.turnOn();
		computer1.turnOff();
		
		Refrigerator refrigerator1 = new Refrigerator(); //기본 생성자 이용
		refrigerator1.setName("공용냉장고");
		refrigerator1.setLocation("거실");
		refrigerator1.turnOn();
		refrigerator1.turnOff();
		
		Television television1 = new Television();
		television1.setName("공용TV");
		television1.setLocation("거실");
		television1.turnOn();
		television1.turnOff();
		System.out.println(television1.getName() + "는 " + television1.getLocation() + "에 있습니다.");
		
		AISpeaker genie = new AISpeaker();
		genie.turnOn("지니");
		AISpeaker.reply(); //객체를 생성하지 않고 reply메소드 호출
	}
}