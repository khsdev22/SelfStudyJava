package sec01.exam01;

public class DmbCellPhoneExample {
	
	public static void main(String[] args) {
		//DmbCellPhone ��ü ����
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone("Note10","White", 7);
		
		// CellPhone Ŭ�����κ��� ��ӹ��� �ʵ�
		System.out.println("�� : " + dmbCellPhone.model);
		System.out.println("���� : " + dmbCellPhone.color);
		
		// DmbCellPhone Ŭ������ �ʵ�
		System.out.println("ä�� : " + dmbCellPhone.channel);
		
		// CellPhone Ŭ�����κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("Hi");
		dmbCellPhone.receiveVoice("Hi");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone Ŭ������ �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(10);
		dmbCellPhone.turnOffDmb();
	}

}
