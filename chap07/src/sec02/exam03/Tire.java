package sec02.exam03;

public class Tire {
	
	// �ʵ�
	public int maxRotation;
	public int accmulatedRotation;
	public String location;
	
	// ������
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// �޼ҵ�
	public boolean roll() {
		++accmulatedRotation;
		if(accmulatedRotation<maxRotation) {
			System.out.println(location + " Tire ���� : " + 
					(maxRotation-accmulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println(location + " Tire ��ũ !!!");
			return false;
		}
	} 
	

}
