package questao2Rendimento;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		float invest, taxa, mes;
		
		Scanner ler =new Scanner(System.in);
		
		
		System.out.println("Digite o valor do investimento inicial: ");
		invest = ler.nextFloat();
		System.out.println("Digite a taxa de rendimento ao mês: ");
		taxa = ler.nextFloat();
		System.out.println("Digite o número de meses: ");
		mes = ler.nextFloat();
		
		Rendimento c1 = new Rendimento(invest, taxa, mes);
		
		System.out.println(c1.calculaRendimento());
		
		ler.close();
		
	
	}

}
