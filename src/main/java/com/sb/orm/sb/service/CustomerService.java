package com.sb.orm.sb.service;

import com.sb.orm.sb.request.CustomerRequest;
import com.sb.orm.sb.response.APIResponse;
import org.springframework.http.ResponseEntity;

public interface CustomerService {
    ResponseEntity<APIResponse> createCustomer(CustomerRequest request);
    ResponseEntity<APIResponse> getAllCustomers();
    ResponseEntity<APIResponse> getByCustomerId(long customerId);
    ResponseEntity<APIResponse> deleteByCustomerId(long customerId);
    ResponseEntity<APIResponse> updateCustomerDetails(long customerId, CustomerRequest request);
}
