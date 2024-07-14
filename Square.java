import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Side Length: ");
		int n = sc.nextInt();
		
		System.out.println();
		
		for(int i = 1; i <= n; i ++)
		{
			for(int j = 1; j <= n; j ++)
			{
				if(j == 1 || j == n || i == 1 || i == n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			} 
			
			System.out.println();
		}
		
		sc.close();

	}

}