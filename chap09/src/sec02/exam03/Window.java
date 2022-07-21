package sec02.exam03;

public class Window {
	
	Button button01 = new Button();
	Button button02 = new Button();
	
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다");			
		}
	};
	
	Window(){
		button01.setOnClickListener(listener);
		button02.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
			}
		});
	}

}
