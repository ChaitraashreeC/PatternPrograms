import java.util.Scanner;

public class MultipleSequence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size Of Grid: ");
		int n = sc.nextInt();
		
		System.out.println();
	
		for(int i = 1; i <= n; i ++)
		{
			for(int j = 1; j <= n; j ++)
			{
				int prod = i * j;
				
				if(prod < 10)
				{
					System.out.print("00");
				}
				else if(prod < 100)
				{
					System.out.print("0");
				}
				
				System.out.print(prod+" ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
