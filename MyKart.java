package Exam02;

public class MyKart implements Kart {

	// 인터페이스에서 상속받은 추상메소드는 반드시 구현해줘야함.
	int myposition = position; // MyKart가 생성되면
								// 무조건 myposition은 0이다(시작위치)

	@Override
	public void go(int num) {
		myposition += num;
		System.out.println("현재 위치 : " + myposition);

	}

	@Override
	public void back(int num) {
		myposition -= num;
		System.out.println("현재 위치 : " + myposition);

	}

	@Override
	public void booster(int power) {
		myposition += power;
		System.out.println("현재 위치 : " + myposition);

	}

}
