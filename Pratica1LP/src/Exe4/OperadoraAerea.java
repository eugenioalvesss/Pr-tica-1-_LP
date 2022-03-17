package Exe4;

import java.util.Random;
import java.util.Scanner;

public class OperadoraAerea {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		
		Random random = new Random();
		String nome;
		String cpf;
		String data;
		String hora;
		byte menu;
		
		int numVooo;
		int numVoo = random.nextInt(100);
		
		System.out.println("Tela inicial de Menu\n");
		
		System.out.println("1 - Cadastrar passageiro \n2 - Check in \n3 - Cancelar voo \n4 - Sair");
		
		System.out.println("\nPor favor, digite uma opção: ");
		menu = ler.nextByte();
		
		if (menu == 1) {
			System.out.println("Tela Cadastro passageiro");
		
			System.out.println("Escreva seu nome: ");
			nome = ler.next();
			
			System.out.println("Escreva seu CPF: ");
			cpf = ler.next();
			
			System.out.println("Escreva a data do seu voo: ");
			data = ler.next();
			
			System.out.println("Escreva o horário do seu voo: ");
			hora = ler.next();
			
			System.out.println("Cadastro efetuado com sucesso! Seu voo é o " + numVoo + ".");
			
		 }else if (menu == 2){
	         System.out.println("Tela Check in ");
	         
	         System.out.println("Escreva seu cpf: ");
	         cpf = ler.next();
	         
	         System.out.println("Escreva o número do seu voo: ");
	         numVooo = ler.nextInt();
	         
	         System.out.println("Check in realizado com sucesso!");
	         
	     }else if (menu == 3){
	         System.out.println("Tela Cancelar voo");
	         
	         System.out.println("Escreva seu cpf: ");
	         cpf = ler.next();
	         
	         System.out.println("Escreva o número do seu voo: ");
	         numVooo = ler.nextInt();
	         
	         System.out.println("Voo cancelado com sucesso!");
	         
	    // }else {  
	     //   break;

	
	     }
	}


}

	
	 
	
