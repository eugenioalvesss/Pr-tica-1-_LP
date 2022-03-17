package Exe3;

import java.util.Scanner;

public class Frase {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		String frase;
		
		System.out.println("Escreva uma frase: ");
		frase = ler.nextLine();
		
		frase = frase.toUpperCase();
		
		int numVogal = 0;
		
		String vogais = "";
		char c;
		for (int i = 0; i < frase.length(); i++) 
			{
		
			c = frase.charAt(i);
			if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
			{
				vogais = vogais + Character.toString(c);
				System.out.println(vogais);
			}

		}
		
		if(vogais.contains("A"))
			numVogal ++;
		
		if(vogais.contains("E"))
			numVogal ++;
		
		if(vogais.contains("I"))
			numVogal ++;
		
		if(vogais.contains("O"))
			numVogal ++;
		
		if(vogais.contains("U"))
			numVogal ++;
		
		
		System.out.println("A frase: " + frase + ", possui " + numVogal + " vogal(is)" );
	}
	
}
