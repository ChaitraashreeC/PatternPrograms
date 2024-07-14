import java.util.Scanner;

public class GridWithDividersPattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number Of Rows: ");
		int n = sc.nextInt();
		
		System.out.println();
		
		for(int i = 1; i <= n; i ++)
		{
			for(int j = 1; j <= n; j ++)
			{
				if(j == 1 || j == n || i == 1 || i == n || 
						j == n/2 || i == n/2 || 
						i == j || i+j == n+1 ||
						i+j == (n/2)+1 || j-i == n/2 ||
						i-j == n/2 || i+j == (n+(n/2)+1) ||
						j == n/4 || i == n/4 ||
						j == ((3*n)/4) || i == ((3*n)/4))
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
