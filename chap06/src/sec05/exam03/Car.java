package sec05.exam03;

public class Car {
	// �ν��Ͻ� �ʵ�
	int speed;
	
	// �ν��Ͻ� �޼���
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}
	
}
