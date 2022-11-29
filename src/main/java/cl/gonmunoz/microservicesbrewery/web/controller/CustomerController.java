package cl.gonmunoz.microservicesbrewery.web.controller;

import cl.gonmunoz.microservicesbrewery.services.CustomerService;
import cl.gonmunoz.microservicesbrewery.web.model.CustomerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<Void> createCustomer(@RequestBody CustomerDto customer){
        CustomerDto savedCustomer = customerService.createCustomer(customer);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/customer" + savedCustomer.getId().toString());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }


    @PutMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCustomer(@PathVariable UUID customerId, @RequestBody CustomerDto customer){
        customerService.updateCustomer(customerId, customer);
    }

    @DeleteMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable UUID customerId){
        customerService.deleteCustomer(customerId);
    }
}
