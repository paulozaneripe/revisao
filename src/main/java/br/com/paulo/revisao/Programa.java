package br.com.paulo.revisao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args_) {
		
		List<String> nomes = new ArrayList<>();
		String nome;
		
		String[] args = {"somar","4","2"};
		
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
			
			if(args.length <= 3) {
				if("dividir".equals(args[0])) {
					dividir(args);
				} else if("somar".equals(args[0])) {
					somar(args);
				} else if("multiplicar".equals(args[0])) {
					multiplicar(args);
				} else {
					System.out.println("A operação chamada '" + args[0] + "' não existe!");
				}
			} else {
				System.err.println("Erro! Foram passados mais de 3 argumentos!\n");
			}
			
		} catch (Exception e) {
			System.err.println("Valor inválido!");
		}
	}
	
	private static void dividir(String[] args) {
 
		Integer divisao = Integer.valueOf(args[1]) / Integer.valueOf(args[2]);
        
        System.out.println("Resultado da divisão: " + divisao);
	}
	
	private static void somar(String[] args) {
		 
		Integer soma = Integer.valueOf(args[1]) + Integer.valueOf(args[2]);
        
        System.out.println("Resultado da soma: " + soma);
	}
	
	private static void multiplicar(String[] args) {
		 
		Integer multiplicacao = Integer.valueOf(args[1]) * Integer.valueOf(args[2]);
        
        System.out.println("Resultado da soma: " + multiplicacao);
	}
}
