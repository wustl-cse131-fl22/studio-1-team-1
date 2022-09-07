package studio1;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first integer");
		int n1 = in.nextInt();
		System.out.print("Enter second integer");
		int n2 = in.nextInt();
		double n3=((double)n1+(double)n2)/2;
		System.out.print("The average of "+n1+ " and"+n2+ " is "+n3);

	}

}
