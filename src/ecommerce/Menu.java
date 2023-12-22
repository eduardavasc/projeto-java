package ecommerce;

import java.util.InputMismatchException;
import java.util.Scanner;

import util.Cores;

public class Menu {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
	        Scanner scanner = new Scanner(System.in);
	        int opcao;
		
	    while (true) {
		System.out.println(Cores.TEXT_BLACK_BOLD + Cores.ANSI_WHITE_BACKGROUND);
		System.out.println("                                                     ");
		System.out.println("                     GEM.COM                         ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("            1 - Criar Conta                          ");
		System.out.println("            2 - Visualizar Produtos                  ");
		System.out.println("            3 - Adicionar ao Carrinho                ");
		System.out.println("            4 - Visualizar Carrinho                  ");
		System.out.println("            5 - Finalizar Compra                     ");
		System.out.println("            00 - Sair                                 ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("Entre com a opção desejada:                          ");
		System.out.println(Cores.TEXT_BLACK_BOLD + Cores.ANSI_WHITE_BACKGROUND);
		
		try {
			opcao = leia.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("\nDigite valores inteiros!");
			leia.nextLine();
			opcao = 0;
		}

		if (opcao == 00) {

			System.out.println();
			System.out.println("*********************************************************");
			System.out.println("              GEN.COM AGRADECE SUA VISITA                ");
			leia.close();
			System.exit(0);
		}
		switch (opcao) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 0:
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
}
