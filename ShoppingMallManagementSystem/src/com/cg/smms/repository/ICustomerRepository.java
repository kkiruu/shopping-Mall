package com.cg.smms.repository;

import com.cg.smms.entities.Customer;

public interface ICustomerRepository {
public Customer addCustomer(Customer customer);
public Customer updateCustomer(Customer customer);
public Customer searchCustomer(long ID);
public Customer deleteCustomer(long ID);


}
