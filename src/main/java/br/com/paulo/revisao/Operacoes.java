package br.com.paulo.revisao;

import java.util.Objects;

public class Operacoes {
	public static void main(String[] args_) {
	
		String[] args = {"somar","4","2"};
		
		if(args.length > 0 && Objects.nonNull(args)) {
			if(args.length <= 3) {
				if("dividir".equals(args[0])) {
					dividir(args);
				} else if("somar".equals(args[0])) {
					somar(args);
				} else if("multiplicar".equals(args[0])) {
					multiplicar(args);
				} else {
					System.err.println("A operação chamada '" + args[0] + "' não existe!");
				}
			} else {
				System.err.println("Erro! Foram passados mais de 3 argumentos!\n");
			}
		} else {
			System.err.println("Erro! Argumentos vazios!");
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
