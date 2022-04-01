package br.com.fiap.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Contrato {
	private int number;
	private Date date;
	private double contractValue;
	private int installments;
	
	public Contrato(int number, Date date, double contractValue, int installments) {
		super();
		this.number = number;
		this.date = date;
		this.contractValue = contractValue;
		this.installments = installments;
	}
	
	public void CalculoParcelas(Contrato contrato) throws ParseException {
		SimpleDateFormat dformat= new SimpleDateFormat("dd/MM/yyyy");
		double valorParcelas = contrato.contractValue / contrato.installments;
		for (int i = 1; contrato.installments >= i; i++) {
			
			double valorJuros = valorParcelas + (valorParcelas * 0.01) * i;
			valorJuros += valorJuros*0.02;
			contrato.date.setMonth(contrato.date.getMonth() + 1); 
			System.out.println(dformat.format(contrato.date) + " - " + valorJuros );
			
		}
	}
	

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getContractValue() {
		return contractValue;
	}

	public void setContractValue(double contractValue) {
		this.contractValue = contractValue;
	}

	public int getInstallments() {
		return installments;
	}

	public void setInstallments(int installments) {
		this.installments = installments;
	}
	
	
	
	
	
}
