package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.tools.DiagnosticCollector;

import model.entities.Sale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre o caminho do arquivo: ");
		String path = sc.next();

		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Sale> list = new ArrayList<>(); 
			 
			String line = br.readLine();
			
			while (line != null) {
			
				
				 String[] fields = line.split(",");
				
				int month = Integer.parseInt(fields[0]);
				int year = Integer.parseInt(fields[1]);
				String name = fields[2];
				int items = Integer.parseInt(fields[3]);
				double vendas = Double.parseDouble(fields[4]);
		
				list.add( new Sale(month, year, name, items, vendas));
				 
				line = br.readLine();
			}
		
			Map<String, Double> map = new HashMap<>();
			 
			for(Sale sale : list) {
				map.put(sale.getSeller(),0.0);
			}
			
			for (String saller : map.keySet()) {
			double vendasTotal = list.stream()
					.filter(s -> s.getSeller().equals(saller))
					.map(s -> s.getTotal())
				 .reduce(0.0,(x, y) -> x + y);
			map.put(saller,vendasTotal);
		 }
			for (String saller : map.keySet()) {
			
				System.out.println(saller + " - " +String.format("%.2f", map.get(saller) ));
			}
			
		}
		
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		sc.close();

	}
}

