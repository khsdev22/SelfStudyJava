package sec02.exam05;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child(); // 자동 타입 변환 (자식 -> 부모) 
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		Child child = (Child) parent;
		child.field2 = "yyy";
		child.method3();
		
	}

}
