package sec01.exam06;

public class SportCar extends Car{

	@Override
	public void speedUp() {speed += 10;}
	
//	@Override
//	public void stop() {
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	} final 메소드로 정의되어 있으므로 재정의 불가하다
}
