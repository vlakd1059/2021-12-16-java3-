package Exam02;

public class MyKart implements Kart {

	// �������̽����� ��ӹ��� �߻�޼ҵ�� �ݵ�� �����������.
	int myposition = position; // MyKart�� �����Ǹ�
								// ������ myposition�� 0�̴�(������ġ)

	@Override
	public void go(int num) {
		myposition += num;
		System.out.println("���� ��ġ : " + myposition);

	}

	@Override
	public void back(int num) {
		myposition -= num;
		System.out.println("���� ��ġ : " + myposition);

	}

	@Override
	public void booster(int power) {
		myposition += power;
		System.out.println("���� ��ġ : " + myposition);

	}

}
