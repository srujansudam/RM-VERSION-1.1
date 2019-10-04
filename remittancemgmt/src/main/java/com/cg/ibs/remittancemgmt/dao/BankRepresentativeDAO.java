package com.cg.ibs.remittancemgmt.dao;

import java.util.Map;

import com.cg.ibs.remittancemgmt.bean.Customer;

public interface BankRepresentativeDAO {
	public Map<String, Customer> getDetails(); // Object Array

	public void copyDetails(String UCI);
}
