package application;

import java.util.Locale;
import java.util.Scanner;

import utilities.Bill;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Sexo: ");
		Bill.gender = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		Bill.beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		Bill.softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		Bill.barbecue = sc.nextInt();

		System.out.println();
		System.out.println("RELATÓRIO: ");
		System.out.printf("Consumo = %.2f\n ", Bill.feeding());

		if (Bill.cover() == 0) {
			System.out.println("Isento de Couvert ");
		} else {
			System.out.printf("Couvert = %.2f\n ", Bill.cover());
		}

		System.out.printf("Ingresso = %.2f\n ", Bill.ticket());
		System.out.println();
		System.out.printf("Valor a pagar = R$ %.2f\n ", Bill.total());
		sc.close();
	}

}
