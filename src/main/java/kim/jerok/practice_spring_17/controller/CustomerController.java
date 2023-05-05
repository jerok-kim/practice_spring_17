package kim.jerok.practice_spring_17.controller;

import kim.jerok.practice_spring_17.model.Customer;
import kim.jerok.practice_spring_17.model.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CustomerController {

    private final CustomerRepository customerRepository;

    @PostMapping("/customers")
    public ResponseEntity<?> save() {
        Customer customer = Customer.builder()
                .name("홍길동")
                .tel("0102222")
                .build();
        Customer customerPS = customerRepository.save(customer);
        return new ResponseEntity<>(customerPS, HttpStatus.CREATED);
    }

    @GetMapping("/customers")
    public ResponseEntity<?> findAll() {
        List<Customer> customerListPS = customerRepository.findAll();
        return new ResponseEntity<>(customerListPS, HttpStatus.OK);
    }

}
