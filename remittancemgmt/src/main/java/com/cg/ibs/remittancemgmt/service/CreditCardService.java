package com.cg.ibs.remittancemgmt.service;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import com.cg.ibs.remittancemgmt.bean.CreditCard;

public interface CreditCardService {
	public List<CreditCard> showCardDetails(String UCI);//FROM DAO

	public boolean validateCardNumber(BigInteger creditCardNumber);

	public boolean validateDateOfExpiry(String creditDateOfExpiry);

	public boolean validateNameOnCard(String nameOnCreditCard);

	public boolean deleteCardDetails(String UCI, BigInteger creditCardNumber);//FROM DAO

	public void saveCardDetails(String UCI, CreditCard card);//FROM DAO
}
