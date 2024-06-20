package test.inovasi.daya.solusi.service;

import test.inovasi.daya.solusi.dto.request.CustomerRequest;
import test.inovasi.daya.solusi.dto.response.CustomerResponse;

public interface CustomerService {

    CustomerResponse create(CustomerRequest request);
}
