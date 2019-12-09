package basics;
import java.util.Scanner;
public class AddIntegers {
	 public static void main(String[] args){
		
		 Scanner sc = new Scanner(System.in); 
		 System.out.println("enter num1,num2 values: ");
		 int num1 = sc.nextInt();
		 int num2 = sc.nextInt();
		 int sum = num1+num2;
		 System.out.println("Value of sum is: " + sum);
		 
		 }

}
