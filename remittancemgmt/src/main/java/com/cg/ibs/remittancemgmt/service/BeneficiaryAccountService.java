package com.cg.ibs.remittancemgmt.service;

import java.math.BigInteger;

import com.cg.ibs.remittancemgmt.bean.Beneficiary;

public interface BeneficiaryAccountService {
	public Beneficiary showBeneficiaryAccount();

	public boolean validateBeneficiaryAccountNumber(BigInteger accountNumber);

	public boolean validateBeneficiaryAccountName(String accountName);

	public boolean validateBeneficiaryIfscCode(String Ifsc);

	public boolean validateBeneficiaryBankName(String bankName);

	public boolean modifyBeneficiaryAccountDetails(BigInteger accountNumber);

	public boolean deleteBeneficiaryAccountDetails(BigInteger accountNumber);

	public boolean saveBeneficiaryAccountDetails(Beneficiary beneficiary);
}
