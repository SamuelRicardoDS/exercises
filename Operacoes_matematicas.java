package exercises;
import java.util.Scanner;

public class Operacoes_matematicas {
	public static void main(String[] args) {
		
		String operacao;
		int numum, numdois, soma, subtracao, multiplicacao;
			
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Entre com a operação a ser realizada (+, - ou *):\n");
		operacao = ler.next();
		System.out.print("Entre com o primeiro número:\n");
		numum = ler.nextInt();
		System.out.print("Entre com o segundo número:\n");
		numdois = ler.nextInt();
		
		soma = (numum +numdois); 
		subtracao = (numum -numdois);
		multiplicacao = (numum * numdois);
		
		switch (operacao) {
		    case "+" :
		        System.out.print("O resultado da operação é: " + soma);
			    break;
			
		    case "-":
		    	System.out.print("O resultado da operação é: " + subtracao);
		    	break;
		    	
		    case "*":
		    	System.out.print("O resultado da operação é: " + multiplicacao);
		    	break;
		    	
		    default:
		    	System.out.print("Operação inválida");    	
		}
	}
}
