package sec02.exam02;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; // 자동 타입 변환
		parent.method1(); // 상속 부모 메소드 호출
		parent.method2(); // 재정의된 메소드 호출
//		parent.method3(); // 호출 불가능 - 부모에서 정의가 되어있지 않다.
	}
}
