package cl.gonmunoz.microservicesbrewery.services;

import cl.gonmunoz.microservicesbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto createCustomer(CustomerDto customer);

    void updateCustomer(UUID customerId, CustomerDto customer);

    void deleteCustomer(UUID customerId);
}
