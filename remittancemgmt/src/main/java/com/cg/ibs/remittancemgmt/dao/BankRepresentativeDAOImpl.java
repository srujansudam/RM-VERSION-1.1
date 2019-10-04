package com.cg.ibs.remittancemgmt.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.ibs.remittancemgmt.bean.Beneficiary;
import com.cg.ibs.remittancemgmt.bean.CreditCard;
import com.cg.ibs.remittancemgmt.bean.Customer;

public class BankRepresentativeDAOImpl implements BankRepresentativeDAO {
	private static Map<String , Customer> finalMap = new HashMap<>();
	private static Map<String, Customer> tempMap = new HashMap<>();
	@Override
	public Map<String, Customer> getDetails() {
		return tempMap;
	}

	@Override
	public void copyDetails(String UCI, int decision, CreditCard card, Beneficiary beneficiary) {
		
	}
}
