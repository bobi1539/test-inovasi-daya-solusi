package test.inovasi.daya.solusi.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.inovasi.daya.solusi.constant.Endpoint;
import test.inovasi.daya.solusi.dto.request.ProductRequest;
import test.inovasi.daya.solusi.dto.response.ProductResponse;
import test.inovasi.daya.solusi.service.ProductService;

@RestController
@RequestMapping(Endpoint.PRODUCT)
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ProductResponse create(
            @RequestBody @Valid ProductRequest request
    ) {
        return productService.create(request);
    }
}
