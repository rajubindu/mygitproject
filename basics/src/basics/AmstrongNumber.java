package basics;

public class AmstrongNumber {
	  
		  public static void main(String[] args)  {  
		    int c=0,a,temp;  
		    int n=154;//It is the number to check  
		    temp=n;  
		    while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");   
		   }  


}
