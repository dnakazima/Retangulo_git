package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Medidas;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Medidas x, y;
		
		x = new Medidas();
		y = new Medidas();
				
		System.out.println("Entre com as mediadas: ");
		x.altura = sc.nextDouble();
		y.largura = sc.nextDouble();
		
		double areaR = Medidas.area();
		
		System.out.println(areaR);
		
		sc.close();
	}

}
