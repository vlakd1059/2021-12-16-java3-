package Exam02;

public interface Kart {
	// 카트의 설계도

	// 1. 시작위치=0;
	int position = 0; // 게임 시작되는 위치

	// 2. 앞으로 가는 기능
	public abstract void go(int num); // num -> 얼마만큼 앞으로 가는지

	// 3. 뒤로 가는 기능
	public abstract void back(int num); // num -> 얼마만큼 뒤로 가는지

	// 4. 부스터 기능
	public abstract void booster(int power); // power -> 부스터 얼마나 세게 할건지

}
