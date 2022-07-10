package sec01.exam01;

public class DmbCellPhoneExample {
	
	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone("Note10","White", 7);
		
		// CellPhone 클래스로부터 상속받은 필드
		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색상 : " + dmbCellPhone.color);
		
		// DmbCellPhone 클래스의 필드
		System.out.println("채널 : " + dmbCellPhone.channel);
		
		// CellPhone 클래스로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("Hi");
		dmbCellPhone.receiveVoice("Hi");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone 클랩스의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(10);
		dmbCellPhone.turnOffDmb();
	}

}
