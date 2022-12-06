package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int atack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();

		Champion champion1 = new Champion(name, life, atack, armor);

		System.out.println();
		System.out.println("Digite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Vida inicial: ");
		int vidaInicial = sc.nextInt();
		System.out.print("Ataque: ");
		int ataque = sc.nextInt();
		System.out.print("Armadura: ");
		int armadura = sc.nextInt();
		Champion champion2 = new Champion(nome, vidaInicial, ataque, armadura);

		System.out.println();
		System.out.println("Quantos turnos você deseja executar? ");
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			champion1.takeDamage(champion2);
			champion2.takeDamage(champion1);

			System.out.printf("\nResultado do turno: %d\n", i + 1);
			System.out.println(champion1.status());
			System.out.println(champion2.status());

			if (champion1.getLife() <= 0 || champion2.getLife() <= 0) {

				break;
			}
		}

		System.out.println("FIM DO COMBATE");
		sc.close();
	}
}
