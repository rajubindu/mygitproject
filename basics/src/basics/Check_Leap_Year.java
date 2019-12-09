package basics;
import java.util.Scanner;
public class Check_Leap_Year {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any year: ");
		int year = s.nextInt();
		boolean leap = false;
		if (year % 400 == 0)
		{
			leap = true;
		}
		
		else if (year % 100 == 0)
		{
			leap = false;
		}
		else if (year % 4 == 0)
		{
			leap = true;
		}
		else
		{
			leap = false;
		}
		if(leap)
		{
			System.out.println(year +" is a leap year");		
		}
		else
		{
			System.out.println(year +" is not a leap year");
		}
	}

}
