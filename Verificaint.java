package exercises;
import java.util.Scanner;

public class Verificaint {
	
	public static void main(String[] args) {
		java.util.Scanner ler = new Scanner(System.in);
		
	    int caracter;
	       
	    try {
	    	System.out.print("Digite o caracter a ser verificado:");
	    	caracter = ler.nextInt();
	    	
	    	System.out.println(true);
	    } catch(Exception e) {
	    	System.out.println(false);
	    }
	}
}
