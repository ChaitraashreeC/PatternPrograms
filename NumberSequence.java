import java.util.Scanner;

public class NumberSequence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size Of Grid: ");
		int n = sc.nextInt();
		
		System.out.println();
		
		int count = 1;
		for(int i = 1; i <= n; i ++)
		{
			 for(int j = 1; j <= n; j ++)
			 {
				 if(count < 10)
				 {
					 System.out.print("00");
				 }
				 else if(count < 100)
				 {
					 System.out.print("0");
				 }
				 
				 System.out.print(count+" ");
				 count ++;
					 
			 }
			 System.out.println();
		 }
		 
		 sc.close();

	}

}
