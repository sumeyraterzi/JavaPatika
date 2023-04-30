package Java101Project;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 1;

        System.out.print("Fibonacci serisi: ");

        for (int i = 1; i <= 10; i++) {
            System.out.print(a + " ");

            int sum = a + b;
            a = b;
            b = sum;
		}

	}

}
