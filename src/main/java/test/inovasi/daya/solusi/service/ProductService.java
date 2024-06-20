package test.inovasi.daya.solusi.service;

import test.inovasi.daya.solusi.dto.request.ProductRequest;
import test.inovasi.daya.solusi.dto.response.ProductResponse;

public interface ProductService {

    ProductResponse create(ProductRequest request);
}
