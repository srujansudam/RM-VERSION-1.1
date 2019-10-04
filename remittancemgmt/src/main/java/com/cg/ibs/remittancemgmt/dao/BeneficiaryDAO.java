package com.cg.ibs.remittancemgmt.dao;

import java.math.BigInteger;
import java.util.ArrayList;

import com.cg.ibs.remittancemgmt.bean.Beneficiary;
import com.cg.ibs.remittancemgmt.exception.RmExceptions;

public interface BeneficiaryDAO {

	public ArrayList<Beneficiary> getDetails(String UCI);

	public void copyDetails(String UCI, Beneficiary beneficiary)throws RmExceptions;

	public boolean updateDetails(String UCI, Beneficiary beneficiary) throws RmExceptions;
	
	public boolean deleteDetails(String UCI, BigInteger accountNumber) throws RmExceptions;

}
