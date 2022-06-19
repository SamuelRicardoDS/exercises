package exercises;
import java.util.Scanner;

public class Soma_de_positivos {
	public static void main(String[] args) {
		
		int num;
		int soma = 0;
		
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um numero positivo para ser somado ou negativo para sair:\n");
		num = ler.nextInt();

		do {
			soma += num;

			System.out.print("Digite um numero positivo para ser somado ou negativo para sair:\n");
			num = ler.nextInt();
		}while(num >= 0);
		
		System.out.print("A soma é: " + soma);
	}
}
