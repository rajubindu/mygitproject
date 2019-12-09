package basics;
import java.util.Scanner;
public class StarPttern {



	private static Scanner Sc;

	public static void main(String[] args) {
	int rows;	
	  Sc = new Scanner(System.in);
           rows = Sc.nextInt(); 
			for(int i = 1;i<= rows;i++)
			{
				for(int j = 1;j<i;j++)
				{
					System.out.print(" * ");
				}
				System.out.println();
			}
	
	
	
	
	}
	
	

}
