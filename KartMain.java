package Exam02;

import java.util.Scanner;

public class KartMain {

	public static void main(String[] args) {

		MyKart mk = new MyKart();
		// ù �������� 0
		Scanner sc = new Scanner(System.in);
		while (mk.myposition < 100) {
			System.out.print("|| 1. ���� || 2. ���� || 3. �ν��� ||");
			int menu = sc.nextInt();
			if (menu == 1) {
				// ���� ��ġ�� 10��ŭ �����ΰ�����
				mk.go(10);
			} else if (menu == 2) {
				// ���� ��ġ�� 10��ŭ �ڷΰ�����
				mk.back(10);
			} else if (menu == 3) {
				// ���� ��ġ�� 30��ŭ ������ ������.
				mk.booster(30);
			}

		}
		System.out.println("������ġ : " + mk.myposition);

	}

}
