package basics;

public class UnaryDemo {
	public static void main(String[] args){
		int a=25;
		int b=20;
		int c=0;
		System.out.println(++c + b--);
		System.out.println(b + b++);
		System.out.println(++a);
		System.out.println(--b);
		b = ++a;
		System.out.println("b value is:" +b);
		
	}

}
