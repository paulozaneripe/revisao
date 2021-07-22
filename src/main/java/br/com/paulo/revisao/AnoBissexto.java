package br.com.paulo.revisao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AnoBissexto {
	public static void main(String[] args) {
		
		String data;
		long i = 0;
		
		try(Scanner ler = new Scanner(System.in)) {
            System.out.print("Informe uma data (dd/mm/aaaa): ");
            data = ler.nextLine();
            
            LocalDate dataFormatada = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            
            if(dataFormatada.getDayOfWeek().toString().equals("SUNDAY")) {
            	System.out.println("\nDomingo\n");
			} else if(dataFormatada.getDayOfWeek().toString().equals("MONDAY")) {
            	System.out.println("\nSegunda-feira\n");
            } else if(dataFormatada.getDayOfWeek().toString().equals("TUESDAY")) {
            	System.out.println("\nTer�a-feira\n");
            } else if(dataFormatada.getDayOfWeek().toString().equals("WEDNESDAY")) {
            	System.out.println("\nQuarta-feira\n");
            } else if(dataFormatada.getDayOfWeek().toString().equals("THURSDAY")) {
            	System.out.println("\nQuinta-feira\n");
            } else if(dataFormatada.getDayOfWeek().toString().equals("FRIDAY")) {
            	System.out.println("\nSexta-feira\n");
            } else if(dataFormatada.getDayOfWeek().toString().equals("SATURDAY")) {
            	System.out.println("\nS�bado\n");
            }
            
            Integer ano = dataFormatada.getYear();
            
            if (dataFormatada.isLeapYear()) {
            	 System.out.println(ano + " � um ano bissexto.");
            } else {
            	 System.out.println(ano + " n�o � um ano bissexto.");
            	 while(!dataFormatada.plusYears(i).isLeapYear()) {
            		 ++i;
            	 }
            	 System.out.println(dataFormatada.plusYears(i).getYear() + " � o pr�ximo ano bissexto.");
            }
            
		} catch (Exception e) {
			System.err.println("Valor inv�lido!");
		}
	}
}
