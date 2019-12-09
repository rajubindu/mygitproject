package basics;
import java.util.Scanner;
public class OutPutFile {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		 System.out.println("upper case alphabets: ");
		 char ch = sc.next().charAt(0);
		 for(ch='A';ch<='Z';ch++);
		 System.out.println(ch + " ");
		 System.out.println("lower case alphabets: ");
		 for(ch='a';ch<='b';ch++);
		 System.out.println(ch + " ");
		
	
	}

}
