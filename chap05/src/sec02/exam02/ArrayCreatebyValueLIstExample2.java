package sec02.exam02;

public class ArrayCreatebyValueLIstExample2 {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {89,97,87};
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("���� : "+ sum1);
		
		int sum2 = add(new int[] {83,97,87});
		System.out.println("���� : " +sum2);
		System.out.println();
	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i =0; i<3; i++)
		{
			sum += scores[i];
		}
		return sum;
	}
}
