import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float sum = 0, count = 0;
		float avg;
		Scanner input = new Scanner(System.in);
		
		try{
			System.out.print("Enter some integers: ");
		
		int a = input.nextInt();
		while (a != 0) {

			if (a == (int) a) {
				sum += a;
				count++;
			} else {
				System.out.println("Please enter numbers only");
			}
			a = input.nextInt();
		}
		avg = (float) (sum / (count) * 1.0);
		System.out.println("The total is : " + sum);
		System.out.println("The average is : " + avg);
		}
		catch(Exception ex)
		{
			System.out.println("Please use only numbers.");
		}
	}

}
