package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {
	public static void main(String[] args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int num = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		Double value = sc.nextDouble();
		System.out.print("Entre com o numero de parcelas: ");
		int numParcelas = sc.nextInt();
		
		Contract contract = new Contract(num, date, value);
		
		ContractService contractService = new ContractService(new PaypalService());
		
		
		contractService.processContract(contract, numParcelas);
		
		System.out.println("Parcelas:");
		
		for(Installment i : contract.getInstallments()) {
			System.out.println(i);
		}
		
		
		
		
		
		sc.close();
	}
}
