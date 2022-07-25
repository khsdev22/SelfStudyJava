package sec01.exam07;

public class SysyemTImeExample {
	public static void main(String[] args) {
		long time1 = System.nanoTime(); // <- 시작 시간 읽기
		
		int sum = 0;
		for(int i = 1; i<=1000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		System.out.println("합 : " + sum);
		System.out.println((time2-time1)+ " 초 소요/");
	}
}
