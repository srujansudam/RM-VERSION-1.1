package com.cg.ibs.remittancemgmt.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import com.cg.ibs.remittancemgmt.bean.Beneficiary;
import com.cg.ibs.remittancemgmt.bean.Customer;
import com.cg.ibs.remittancemgmt.exception.RmExceptions;

public class BeneficiaryDAOImpl implements BeneficiaryDAO {
	private static Customer customer = new Customer();
	private static Map<String, Customer> tempMap = new HashMap<>();
	private static ArrayList<Beneficiary> savedBeneficiaries = new ArrayList<>();
	Iterator<Beneficiary> it;

	@Override
	public ArrayList<Beneficiary> getDetails(String UCI) {
		return tempMap.get(UCI).getSavedBeneficiaries();
	}

	@Override
	public void copyDetails(String UCI, Beneficiary beneficiary) throws RmExceptions {
		if (tempMap.get(UCI).getSavedBeneficiaries().contains(beneficiary)) {
			throw new RmExceptions("Beneficiary already added");
		} else {
			savedBeneficiaries.add(beneficiary);
			customer.setSavedBeneficiaries(savedBeneficiaries);
			tempMap.put(UCI, customer);
		}

	}

	@Override
	public boolean updateDetails(String UCI, Beneficiary beneficiary1) throws RmExceptions {

		boolean result = false;

		if (null == tempMap.get(UCI).getSavedBeneficiaries()) {
			throw new RmExceptions("Beneficiary doesn't exist");

		}
		it = tempMap.get(UCI).getSavedBeneficiaries().iterator();
		while (it.hasNext()) {
			Beneficiary beneficiary = (Beneficiary) it.next();
			if (beneficiary.getAccountNumber().equals(beneficiary1.getAccountNumber())) {
				savedBeneficiaries.remove(beneficiary);
				result = true;
			}
		}
		savedBeneficiaries.add(beneficiary1);
		customer.setSavedBeneficiaries(savedBeneficiaries);
		tempMap.put(UCI, customer);

		return result;

	}

	@Override
	public boolean deleteDetails(String UCI, BigInteger accountNumber) throws RmExceptions {
		// TODO Auto-generated method stub
		boolean result = false;

		if (null == tempMap.get(UCI).getSavedBeneficiaries()) {
			throw new RmExceptions("Beneficiary doesn't exist");

		} else {
			it = tempMap.get(UCI).getSavedBeneficiaries().iterator();
			while (it.hasNext()) {
				Beneficiary beneficiary = (Beneficiary) it.next();
				if (beneficiary.getAccountNumber().equals(accountNumber)) {
					savedBeneficiaries.remove(beneficiary);
					result = true;
				}
			}
			return result;
		}

	}

}
