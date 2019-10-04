package com.cg.ibs.remittancemgmt.service;

import com.cg.ibs.remittancemgmt.bean.AutoPayment;

public interface AutoPaymentService {
	public void showIBSServiceProviders();

	public void autoDeduction(AutoPayment autoPayment);

	public boolean updateRequirements(AutoPayment autoPayment);
}
