package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;
import model.interfaces.OnlinePaymentService;

public class ContractService {
	
	private OnlinePaymentService paymentService;  
	
	public ContractService(OnlinePaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	public void processContract(Contract contract, Integer months) {
		//gera as parcelas
		
		for(int i = 0; i < months; i++) {
			LocalDate date = contract.getDate().plusMonths(i+1);
			Double installmentValue = contract.getTotalValue() / months;
			Double taxValue = paymentService.paymentFee(installmentValue);
			Double interestValue = paymentService.interest(installmentValue+taxValue, i+1);
			
			Double totalValue = installmentValue + taxValue + interestValue;
			
			Installment installment = new Installment(date, totalValue);
			contract.getInstallments().add(installment);
		}
	}
}
