package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Addres;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome do departamento: ");
		String nameDepartment = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		Integer payDay = sc.nextInt();
		System.out.print("Email: ");
		sc.nextLine();
		String email = sc.nextLine();
		System.out.print("Telefone: ");
		Integer phone = sc.nextInt();
		Department dept = new Department(nameDepartment, payDay, new Addres(email, phone));
		
		System.out.print("Quantos funcionários tem o departamento? ");
		int n = sc.nextInt();
		String name;
		double salary;
		for (int i = 0; i < n; i++) {
			System.out.println("Dados do funcionário " + (i + 1) + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Salário: ");
			salary = sc.nextDouble();
			Employee employee = new Employee (name, salary);
			dept.addEmployee(employee);
			
		}

		showReport(dept);
		sc.close();
	}
	
	private static void showReport(Department dept) {
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTO: ");
		System.out.print("Departamento Vendas =  R$ " + dept.payroll());
		System.out.println();
		System.out.print("Pagamento realizado no dia " + dept.getPayDay());
		System.out.println();
		System.out.println("Funcionários: " + dept.getEmployees());
		System.out.print("Para dúvidas favor entrar em contato: " + dept.getAddres().getEmail());
	}
}
