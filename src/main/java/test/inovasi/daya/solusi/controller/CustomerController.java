package test.inovasi.daya.solusi.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.inovasi.daya.solusi.constant.Endpoint;
import test.inovasi.daya.solusi.dto.request.CustomerRequest;
import test.inovasi.daya.solusi.dto.response.CustomerResponse;
import test.inovasi.daya.solusi.service.CustomerService;

@RestController
@RequestMapping(Endpoint.CUSTOMER)
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public CustomerResponse create(
            @RequestBody @Valid CustomerRequest request
    ) {
        return customerService.create(request);
    }
}
