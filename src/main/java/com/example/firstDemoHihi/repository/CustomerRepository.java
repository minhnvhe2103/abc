package com.example.firstDemoHihi.repository;

import com.example.firstDemoHihi.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String > {

    Customer findCustomerByIdCustomer(String customerId);

}
