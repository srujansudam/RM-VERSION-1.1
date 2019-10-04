package com.cg.ibs.remittancemgmt.service;

import java.math.BigInteger;
import java.util.Date;

import com.cg.ibs.remittancemgmt.bean.CreditCard;
import com.cg.ibs.remittancemgmt.exception.RmExceptions;

public class CreditCardServiceImpl implements CreditCardService {

	@Override
	public CreditCard showCardDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validateCardNumber(BigInteger cardNumber) throws RmExceptions {
		// TODO Auto-generated method stub
		
		if( cardNumber.compareTo(new BigInteger("999999999999999") ) != 1 && cardNumber.compareTo(new BigInteger("10000000000000000")) != -1)
		{
			throw new RmExceptions("Please enter a valid CreditCard number containing 16 digits");
		}
		else{
			return true;
		}
			
		
	}

	@Override
	public boolean validateDateOfExpiry(Date dateOfExpiry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateNameOnCard(String nameOnCard) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void modifyCardDetails(CreditCard card) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveCardDetails(CreditCard card) {
		// TODO Auto-generated method stub
		
	}
	
}
