package basics;
import java.util.Scanner;
public class ArthmaticOperater {
	private static Scanner sc;

	public static void main(String[] args){
		sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers: ");
		
        double first =	sc.nextDouble();
        double second =	sc.nextDouble();
        
        System.out.println("Enter an operater: ");
          char operater = sc.next().charAt(0);
         double result;
         switch(operater)
         {
         case '+':
        	 result = first + second;
        	 break;
        	 
         case '-':
        	 result = first - second;
        	 break;
         case '*':
        	 result = first * second;
        	 break;
         case '/':
        	 result = first / second;
        	 break;
        	 default:
        		 System.out.println("Operater is not correct");
        		 return;
         }
         System.out.println(result);
       
         
         }
}
	
