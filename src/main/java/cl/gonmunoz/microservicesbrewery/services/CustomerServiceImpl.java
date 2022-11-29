package cl.gonmunoz.microservicesbrewery.services;

import cl.gonmunoz.microservicesbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Emiliano")
                .build();
    }

    @Override
    public CustomerDto createCustomer(CustomerDto customer) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customer) {
        //TODO: implement this
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        //TODO: implement this
    }
}
