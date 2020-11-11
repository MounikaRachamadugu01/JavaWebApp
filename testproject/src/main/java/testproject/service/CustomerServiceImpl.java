package testproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import testproject.dao.CustomerDao;
import testproject.model.Customer;

@Service
@Transactional

public class CustomerServiceImpl implements CustomerService {
	
	CustomerDao customerDao;
	 
	 @Autowired
	 public void setCustomerDao(CustomerDao customerDao) {
	  this.customerDao = customerDao;
	 }

	 public List listAllCustomers() {
	  return customerDao.listAllCustomers();
	 }

	 public void saveOrUpdate(Customer customer) {
	  customerDao.saveOrUpdate(customer);
	 }

	 public Customer findCustomerById(int id) {
	  return customerDao.findCustomerById(id);
	 }

	 public void deleteCustomer(int id) {
	  customerDao.deleteCustomer(id);
	 }

}
