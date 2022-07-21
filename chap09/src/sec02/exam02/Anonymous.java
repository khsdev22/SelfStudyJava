package sec02.exam02;

public class Anonymous {
	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV¸¦ ÄÕ´Ï´Ù.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV¸¦ ²ü´Ï´Ù.");	
		}
	};
}
