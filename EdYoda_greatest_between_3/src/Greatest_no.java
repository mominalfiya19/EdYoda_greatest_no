import java.util.Scanner;
public class Greatest_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c, great;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number:");  
		a = sc.nextInt();  
		
		System.out.println("Enter the second number:");  
		b = sc.nextInt(); 
		
		System.out.println("Enter the third number:");  
		c = sc.nextInt();  
		
		great=(a>b)?(a>c?a:c):(b>c?b:c);
		
		
		System.out.println("The largest number is: "+great);  
	}

}
