package Exe2;
import java.util.Scanner;

public class Carro {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		String placaCarro;
		short anoFab;
		String placaFormatada;

		
		
		System.out.println("Insira a placa do carro: ");
		placaCarro = ler.next();
		
		placaFormatada = placaCarro.toUpperCase();
		
		
		System.out.println("Insira o ano de fabricação do carro: ");
		anoFab = ler.nextShort();
		
		if (anoFab <= 2010) {
			System.out.println("Carro velho!");

		} else if (anoFab <= 2021) {
			System.out.println("Carro semi-novo!");
			
		} else if (anoFab == 2022) {
			System.out.println("Carro novo!");
		} else {
			System.out.println("Dados inválidos :(");
		}

		String placaAlterada = placaFormatada.replace('A', '*')
		.replace('E', '*')
		.replace('I', '*')
		.replace('O', '*')
		.replace('U', '*');
		
		System.out.println(placaAlterada);

	}

}