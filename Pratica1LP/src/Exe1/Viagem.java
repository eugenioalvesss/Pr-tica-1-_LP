package Exe1;
import java.util.Scanner;

public class Viagem {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);

		double VelocidadeMedia, TempoGasto, Autonomia;
		double DistanciaTotal, ConsumoTotal;
		
		System.out.print("Qual foi o tempo gasto na sua viagem(Horas)?");
		TempoGasto = entrada.nextDouble();
		
		System.out.print("Qual foi sua velocidade média durante esse percurso(KM/h)?");
		VelocidadeMedia = entrada.nextDouble();
		
		System.out.print("Quantos KM o veículo rodou por litro de gasolina?");
		Autonomia = entrada.nextDouble();

		DistanciaTotal = VelocidadeMedia * TempoGasto;
		ConsumoTotal = DistanciaTotal / Autonomia;

		System.out.print("\n\nResultados:\n\n");
		System.out.println("O consumo final de combutível na sua viagem foi de "+ ConsumoTotal + "Litros" );


	}
		

}

