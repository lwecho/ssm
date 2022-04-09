package edu.wfu.lu.service;

import edu.wfu.common.utils.Page;
import edu.wfu.lu.po.Customer;

public interface CustomerService {
	
	public Page<Customer> findCustomerList(Integer page, Integer rows,
											String custName,String custSource,
											String custIndustry,String custLevel);
	
	public int createCustomer(Customer customer);

	public Customer getCustomerById(Integer id);
	
	// 更新客户
		public int updateCustomer(Customer customer);
		// 删除客户
		public int deleteCustomer(Integer id);

}
