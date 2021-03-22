import java.util.Scanner;

public class ContaCifre {

	public static void main(String args[]) {
		
		System.out.println("Inserisci un numero");
		
		Scanner input = new Scanner (System.in);
		int a = input.nextInt();
		
		int c = 0;
		
		do {
		
		a = a/10;
		c++;}
		
		
		while (a != 0) ;
		System.out.println(c);
			
			
		
	
	}
}
