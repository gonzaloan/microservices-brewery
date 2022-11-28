package cl.gonmunoz.microservicesbrewery.web.controller;

import cl.gonmunoz.microservicesbrewery.services.CustomerService;
import cl.gonmunoz.microservicesbrewery.web.model.CustomerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;
    @GetMapping("/{customerId}")
    public CustomerDto getCustomer(@PathVariable UUID customerId){
        return customerService.getCustomerById(customerId);
    }

}
