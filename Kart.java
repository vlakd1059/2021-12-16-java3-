package Exam02;

public interface Kart {
	// īƮ�� ���赵

	// 1. ������ġ=0;
	int position = 0; // ���� ���۵Ǵ� ��ġ

	// 2. ������ ���� ���
	public abstract void go(int num); // num -> �󸶸�ŭ ������ ������

	// 3. �ڷ� ���� ���
	public abstract void back(int num); // num -> �󸶸�ŭ �ڷ� ������

	// 4. �ν��� ���
	public abstract void booster(int power); // power -> �ν��� �󸶳� ���� �Ұ���

}
