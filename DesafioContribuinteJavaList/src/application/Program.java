package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		double rendaSalario, rendaServico, rendaGanhoCapital;
		double gastosMedicos, gastosEducacionais;

		System.out.print("Quantos contribuintes você vai digitar? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Digite os dados do " + (i + 1) + "o contribuinte: ");
			System.out.print("Renda anual com salário: ");
			rendaSalario = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			rendaServico = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			rendaGanhoCapital = sc.nextDouble();
			System.out.print("Gastos médicos: ");
			gastosMedicos = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			gastosEducacionais = sc.nextDouble();
			list.add(new TaxPayer(rendaSalario, rendaServico, rendaGanhoCapital, gastosMedicos, gastosEducacionais));
			System.out.println();
		}

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Resumo do " + (i + 1) + "o contribuinte: ");
			System.out.printf("Imposto bruto total:%.2f\n ", list.get(i).grossTax());
			System.out.printf("Abatimento:%.2f\n ", list.get(i).taxRebate());
			System.out.printf("Imposto devido:%.2f\n ", list.get(i).netTax());
			System.out.println();
		}

		sc.close();
	}

}
