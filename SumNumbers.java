import java.util.Scanner;


public class SumNumbers {

		public static void main(String[] args) 
		{
			Scanner kb = new Scanner(System.in);
			System.out.println ("Introduza dois números");
			int numbers[] = new int[2];
	
			int num1 = numbers[0];
			int num2 = numbers[1];
			System.out.println(num1 + "+" + num2 + "=" + sum(num1, num2));
			System.out.println("SLB, o maior");
			}
		
		//método para a soma dos dois números
		private static int sum(int num1, int num2) {
		
			return num1 + num2;

	}
	

}
