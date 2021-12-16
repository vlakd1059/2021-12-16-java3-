package Exam02;

import java.util.Scanner;

public class KartMain {

	public static void main(String[] args) {

		MyKart mk = new MyKart();
		// 첫 시작점은 0
		Scanner sc = new Scanner(System.in);
		while (mk.myposition < 100) {
			System.out.print("|| 1. 전진 || 2. 후진 || 3. 부스터 ||");
			int menu = sc.nextInt();
			if (menu == 1) {
				// 차의 위치가 10만큼 앞으로가야함
				mk.go(10);
			} else if (menu == 2) {
				// 차의 위치가 10만큼 뒤로가야함
				mk.back(10);
			} else if (menu == 3) {
				// 차의 위치가 30만큼 앞으로 가야함.
				mk.booster(30);
			}

		}
		System.out.println("현재위치 : " + mk.myposition);

	}

}
