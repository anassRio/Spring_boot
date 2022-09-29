package com.rionass.demonstration.lombok;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class CustomerService {
    private final CustomerRepository customerRepository;

    List<Customer> getAllCustomers(){
        log.info("Request to GetAllCustomers.");
        log.info("["+ customerRepository.count() +"] Customer returned.");
        return customerRepository.findAll();
    }
}
