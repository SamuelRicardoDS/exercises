package exercises;
import java.util.Scanner;

public class Verifica_par {
	public static void main(String[] args) {
		
		int num;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o numero:\n");
		num = ler.nextInt();
		
		
		if(num % 2 == 0) {
			System.out.print("true");
		} else {
			System.out.print("false");
		}
	}

}
