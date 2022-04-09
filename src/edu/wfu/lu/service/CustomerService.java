package edu.wfu.lu.service;

import edu.wfu.common.utils.Page;
import edu.wfu.lu.po.Customer;

public interface CustomerService {
	
	public Page<Customer> findCustomerList(Integer page, Integer rows,
											String custName,String custSource,
											String custIndustry,String custLevel);
	
	public int createCustomer(Customer customer);

	public Customer getCustomerById(Integer id);
	
	// ���¿ͻ�
		public int updateCustomer(Customer customer);
		// ɾ���ͻ�
		public int deleteCustomer(Integer id);

}
