package com.cg.ibs.remittancemgmt.dao;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.cg.ibs.remittancemgmt.bean.AutoPayment;
import com.cg.ibs.remittancemgmt.bean.Customer;
import com.cg.ibs.remittancemgmt.bean.ServiceProvider;
import com.cg.ibs.remittancemgmt.exception.RmExceptions;

public class AutoPaymentDAOImpl implements AutoPaymentDAO {
	Customer customer = new Customer();
	private static Map<String, Customer> finalMap = new HashMap<>();
	Set<AutoPayment> savedAutoPaymentServices = new HashSet<>();
	AutoPayment autoPayment = new AutoPayment();

	@Override
	public void copyDetails(String UCI, AutoPayment autoPayment) {
		// TODO Auto-generated method stub
		savedAutoPaymentServices.add(autoPayment);
		customer.setSavedAutoPaymentServices(savedAutoPaymentServices);
		finalMap.put(UCI, customer);
	}

	@Override
	public List<AutoPayment> getDetails(String UCI) {
		// TODO Auto-generated method stub

		return ((List<AutoPayment>) finalMap.get(UCI).getSavedAutoPaymentServices());
	}

	@Override
	public boolean deleteDetails(String UCI, BigInteger serviceProviderId) throws RmExceptions {
		// TODO Auto-generated method stub
		boolean result = false;

		if (null == finalMap.get(UCI).getSavedAutoPaymentServices()) {
			throw new RmExceptions("Auto payment service doesn't exist");

		} else {

			for (AutoPayment autoPayment : finalMap.get(UCI).getSavedAutoPaymentServices()) {

				if (autoPayment.getServiceProviderId().equals(serviceProviderId)) {
					savedAutoPaymentServices.remove(autoPayment);
					result = true;
				} // iterator check
			}
			return result;

		}

	}

	@Override
	public List<ServiceProvider> showServiceProviderList() {
		// TODO Auto-generated method stub
		return null;
	}

}
