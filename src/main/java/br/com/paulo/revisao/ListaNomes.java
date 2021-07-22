package br.com.paulo.revisao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListaNomes {
	public static void main(String[] args_) {
		
		List<String> nomes = new ArrayList<>();
		String nome;
		
		try(Scanner ler = new Scanner(System.in)) {
			do {
                System.out.print("Informe um nome: ");
                nome = ler.nextLine();
                nome.replaceAll("\\s+","");
                
                if(!nome.contains(" ") && !nome.isEmpty()) {
                	if(!nome.equals("parar")) {
                		nomes.add(nome);
                	}
                } else {
                	System.err.println("Nomes vazios ou com espaços não permitidos!\n");
                }

            } while(!nome.equals("parar"));
			
			System.out.println("\nNomes: " + Arrays.toString(nomes.toArray()) + "\n");
			
		} catch (Exception e) {
			System.err.println("Valor inválido!");
		}
	}
	
}
