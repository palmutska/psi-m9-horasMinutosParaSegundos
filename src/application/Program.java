package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int horas, minutos, temp;

		//Receber horas e validar
		System.out.print("Introduza as horas: ");
		while(!sc.hasNextInt()) {
			System.out.print("Valor inválido, tente outra vez:");
			sc.next();
		}
		horas = sc.nextInt();
		while(horas < 0) {
			System.out.print("Digite um valor > 0: ");
			horas = sc.nextInt();
		}
		//Receber horas e validar
		System.out.print("Introduza os minutos: ");
		while(!sc.hasNextInt()) {
			System.out.print("Valor inválido, tente outra vez:");
			sc.next();
		}
		minutos = sc.nextInt();
		while(minutos < 0 || minutos > 60) {
			System.out.print("Digite um valor entre 0 e 59: ");
			minutos = sc.nextInt();
		}
		
		int horasMinutosParaSegundos = horasMinutosParaSegundos(horas, minutos);
		int minutosParaSegundos = minutosParaSegundos(horasMinutosParaSegundos);

		System.out.printf("%d horas e %d minutos = %d segundos", horas, minutos, horasMinutosParaSegundos);
		
		System.out.printf("%d minutos = %d segundos", minutos, minutosParaSegundos);
		
		
		sc.close();
	}

	private static int horasMinutosParaSegundos(int horas, int minutos) {
		int horasParaSegundos = horas * 3600;
		int minutosParaSegundos = minutos * 60;
		
		return horasParaSegundos + minutosParaSegundos;
	}
	
	private static int minutosParaSegundos(int minutos) {
		int minutosParaSegundos = minutos * 60;
		
		return minutosParaSegundos;
	}

}
