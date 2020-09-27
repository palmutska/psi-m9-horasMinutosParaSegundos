package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int horas, minutos;
		
		System.out.print("Digite as horas: ");
		horas = sc.nextInt();
		System.out.print("Digite os minutos: ");
		minutos = sc.nextInt();
		
		int hMtoSeg = horasMinutosParaSegundos(horas, minutos);
		int mToSeg = minutosParaSegundos(minutos);
		
		System.out.printf("%d horas e %d minutos = %d segundos\n", horas, minutos, hMtoSeg);
		System.out.printf("%d minutos = %d segundos", minutos, mToSeg);
		
		sc.close();
	}

	private static int horasMinutosParaSegundos(int horas, int minutos) {
		
		if(horas < 0 || minutos < 0 || minutos > 60) {
			return -1;
		}
		int horasParaSegundos = horas * 3600;
		int minutosParaSegundos = minutos * 60;
		
		return horasParaSegundos + minutosParaSegundos;
	}
	
	private static int minutosParaSegundos(int minutos) {
		
		if(minutos < 0 || minutos > 60) {
			return -1;
		}
		
		int minutosParaSegundos = minutos * 60;
		return minutosParaSegundos;
	}

}
