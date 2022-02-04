package com.ofd.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ofd.entity.Customer;
import com.ofd.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;
	@PostMapping("/customer")
	public Customer createCustomer(@RequestBody Customer add)
	{
		return customerService.createCustomer(add);
	}
  @GetMapping("/customer")
  public List<Customer> getCustomer()
  {
	  return customerService.getCustomer();
  }
  @GetMapping("/customer/{id}")
  public Customer getAddresById(@PathVariable int id)
  {
	  return customerService.getCustomerById(id);
  }
  @DeleteMapping("/customer")
  public boolean deleteAllAddress()
  {
	  return customerService.deleteAllCustomer();
  }
  @DeleteMapping("/customer/{id}")
  public String deleteById(@PathVariable int id)
  {
	  return customerService.deleteById(id);
  }
  @PutMapping("/customer/{id}")
  public Customer updateCustomer(@PathVariable int id, @RequestBody Customer obj)
  {
	  return customerService.updateCustomer(id,obj);
  }

}
