package br.com.fiap.main;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import br.com.fiap.entity.Contrato;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat dformat = new SimpleDateFormat("dd/MM/yyyy");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("N° do contrato: ");
		int num = scan.nextInt();
		
		System.out.print("Data em - dd/MM/yyyy : ");
		String dataI = scan.next();
		Date data = dformat.parse(dataI);
		
		System.out.print("Valor do contrato: ");
		double Vcontrato = scan.nextDouble();
		
		System.out.print("Numero de parcelas: ");
		int parcelas = scan.nextInt();
		
		Contrato contrato = new Contrato(num, data, Vcontrato, parcelas);
		contrato.CalculoParcelas(contrato);
		
		
	
	}

}
