package basics;

import java.util.Scanner;

public class Arthmatic {

	public static void main(String[] args){
		
		System.out.println("1.add");
		System.out.println("2.sub");
		System.out.println("3.mul");
		System.out.println("4.div");
		System.out.println("5.mod");
		System.out.println("Enter num1,num2 values: ");    
		Scanner result = new Scanner(System.in);
			int num1 = result.nextInt();
		    int num2 = result.nextInt(); 
		System.out.println("Enter your choice: ");
			int choice= result.nextInt();
	   switch(choice) {
	   
	             case 1 :
	            	      System.out.println("1.addition Value: "+(num1+num2));
	            	      break;
	             case 2 :
	            	 	  System.out.println("1.subtraction value: "+(num1-num2));
           	              break;
           	      
	             case 3 :
           	              System.out.println("1.multiplication value: "+(num1*num2));
           	              break;
           	      
	             case 4 :
           	              System.out.println("1.division value: "+(num1/num2));
           	              break;
           	      
	             case 5 :
           	              System.out.println("1.modulo value: "+(num1%num2));
           	              break;
	            
           	     default :
           	    	     System.out.println("Operation is not correct");
	            	      
	   }
         
         }
}



