package br.com.paulo.revisao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Contagem {
	public static void main(String[] args) {
		
		String data;
		long i = 0;

		try(Scanner ler = new Scanner(System.in)) {
            System.out.print("Informe a data da prova (dd/mm/aaaa): ");
            data = ler.nextLine();
            data = data + " 00:00";
            
            LocalDateTime dataFormatada = LocalDateTime.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
            LocalDateTime dataAtual = LocalDateTime.now();
            
            if(dataAtual.isBefore(dataFormatada)) {
            	
                do {
                	
                	i++;
                	Thread.sleep(1000);
                	for (int j = 0; j < 10; ++j) System.out.println();
                	System.out.println("Tempo até a prova: " + dataAtual.plusSeconds(i).getHour() + ":" + 
                						dataAtual.plusSeconds(i).getMinute() + ":" + 
                						dataAtual.plusSeconds(i).getSecond());
                	
                } while(!dataAtual.plusSeconds(i).isEqual(dataFormatada));
                
            } else {
            	System.err.println("Data incompatível!");
            }
            
		} catch (Exception e) {
			System.err.println("Valor inválido!");
		}
	}
}
