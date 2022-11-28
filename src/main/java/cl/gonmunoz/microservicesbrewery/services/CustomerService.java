package cl.gonmunoz.microservicesbrewery.services;

import cl.gonmunoz.microservicesbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
