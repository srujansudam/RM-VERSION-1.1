package com.cg.ibs.remittancemgmt.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Set;

public class Customer {
	private String UCI;
	private Set<CreditCard> savedCreditCards;
	private Set<AutoPayment> savedAutoPaymentServices;
	private ArrayList<Beneficiary> savedBeneficiaries;
	private BigDecimal currentBalance;

	public BigDecimal getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(BigDecimal currentBalance) {
		this.currentBalance = currentBalance;
	}

	public Customer() {
		super();
	}

	public Customer(String uCI, Set<CreditCard> savedCreditCards, Set<AutoPayment> savedAutoPaymentServices,
			ArrayList<Beneficiary> savedBeneficiaries, BigDecimal currentBalance) {
		super();
		UCI = uCI;
		this.savedCreditCards = savedCreditCards;
		this.savedAutoPaymentServices = savedAutoPaymentServices;
		this.savedBeneficiaries = savedBeneficiaries;
		this.currentBalance = currentBalance;
	}

	@Override
	public String toString() {
		return "Customer [UCI=" + UCI + ", savedCreditCards=" + savedCreditCards + ", savedAutoPaymentServices="
				+ savedAutoPaymentServices + ", savedBeneficiaries=" + savedBeneficiaries + ", currentBalance="
				+ currentBalance + "]";
	}

	public String getUCI() {
		return UCI;
	}

	public void setUCI(String uCI) {
		UCI = uCI;
	}

	public Set<CreditCard> getSavedCreditCards() {
		return savedCreditCards;
	}

	public void setSavedCreditCards(Set<CreditCard> savedCreditCards) {
		this.savedCreditCards = savedCreditCards;
	}

	public Set<AutoPayment> getSavedAutoPaymentServices() {
		return savedAutoPaymentServices;
	}

	public void setSavedAutoPaymentServices(Set<AutoPayment> savedAutoPaymentServices) {
		this.savedAutoPaymentServices = savedAutoPaymentServices;
	}

	public ArrayList<Beneficiary> getSavedBeneficiaries() {
		return savedBeneficiaries;
	}

	public void setSavedBeneficiaries(ArrayList<Beneficiary> savedBeneficiaries) {
		this.savedBeneficiaries = savedBeneficiaries;
	}

}
