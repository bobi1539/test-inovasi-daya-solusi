package test.inovasi.daya.solusi.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import test.inovasi.daya.solusi.dto.request.ProductRequest;
import test.inovasi.daya.solusi.dto.response.ProductResponse;
import test.inovasi.daya.solusi.entity.Product;
import test.inovasi.daya.solusi.helper.EntityHelper;
import test.inovasi.daya.solusi.repository.ProductRepository;
import test.inovasi.daya.solusi.service.ProductService;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public ProductResponse create(ProductRequest request) {
        Product product = Product.builder()
                .name(request.getName())
                .build();
        product = productRepository.save(product);
        return EntityHelper.toProductResponse(product);
    }
}
