package test.inovasi.daya.solusi.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import test.inovasi.daya.solusi.dto.request.CustomerRequest;
import test.inovasi.daya.solusi.dto.response.CustomerResponse;
import test.inovasi.daya.solusi.entity.Customer;
import test.inovasi.daya.solusi.helper.EntityHelper;
import test.inovasi.daya.solusi.repository.CustomerRepository;
import test.inovasi.daya.solusi.service.CustomerService;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public CustomerResponse create(CustomerRequest request) {
        Customer customer = Customer.builder()
                .name(request.getName())
                .build();
        customer = customerRepository.save(customer);
        return EntityHelper.toCustomerResponse(customer);
    }
}
