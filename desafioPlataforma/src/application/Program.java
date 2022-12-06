package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Lesson> list = new ArrayList<>();

		System.out.print("Quantas aulas tem o curso? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a aula: ");
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			char conteudo = sc.next().charAt(0);
			System.out.print("Título: ");
			String title = sc.nextLine();
			if (conteudo == 'c') {
				sc.nextLine();
				System.out.print("URL do vídeo: ");
				String url = sc.nextLine();
				System.out.print("Duração em segundos: ");
				Integer durac = sc.nextInt();
				list.add(new Video(title, url, durac));
			} else {
				sc.nextLine();
				System.out.print("Descrição: ");
				String desc = sc.nextLine();
				System.out.print("Quantidade de questões: ");
				Integer quant = sc.nextInt();
				list.add(new Task(title, desc, quant));
			}
		}

		System.out.println();
		System.out.print("DURAÇÃO TOTAL DO CURSO = ");
		Integer aux = 0;
		for (Lesson lesson : list) {
			aux += lesson.duration();
		}
		System.out.println(aux + " segundos");

		sc.close();
	}

}
