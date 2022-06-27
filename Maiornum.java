package exercises;
import java.util.Scanner;

public class Maiornum {
public static void main(String[] args) {
		
		java.util.Scanner ler = new Scanner(System.in);
		
		int numum, numdois, numtres, numquatro, numcinco;
		
		System.out.print("Entre com o primeiro numero:\n");
		numum = ler.nextInt();
		System.out.print("Entre com o segundo numero:\n");
		numdois = ler.nextInt();
		System.out.print("Entre com o terceiro numero:\n");
		numtres = ler.nextInt();
		System.out.print("Entre com o quarto numero:\n");
		numquatro = ler.nextInt();
		System.out.print("Entre com o quinto numero:\n");
		numcinco = ler.nextInt();
		
		if(numum > numdois && numum > numtres && numum > numquatro && numum > numcinco) {
		    System.out.print(numum);
	    } else if(numdois > numum && numdois > numtres && numdois > numquatro && numdois > numcinco) {
	    	System.out.print(numdois);
	    } else if(numtres > numum && numtres > numdois && numtres > numquatro && numtres > numcinco) {
	    	System.out.print(numtres);
	    } else if(numquatro > numum && numquatro > numdois && numquatro > numtres && numquatro > numcinco) {
	    	System.out.print(numquatro);
	    } else {
	    	System.out.print(numcinco);
	    }
	}

}
