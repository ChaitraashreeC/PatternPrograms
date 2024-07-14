import java.util.Scanner;

public class InvertedTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number Of Rows For Inverted Triangle: ");
		int n = sc.nextInt();
		
		System.out.println();
		
		for(int i = 1; i <= n; i ++)
		{
			for(int j = 1; j <= n-i+1; j ++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		sc.close();

	}

}
