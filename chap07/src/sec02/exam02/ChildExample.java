package sec02.exam02;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; // �ڵ� Ÿ�� ��ȯ
		parent.method1(); // ��� �θ� �޼ҵ� ȣ��
		parent.method2(); // �����ǵ� �޼ҵ� ȣ��
//		parent.method3(); // ȣ�� �Ұ��� - �θ𿡼� ���ǰ� �Ǿ����� �ʴ�.
	}
}
