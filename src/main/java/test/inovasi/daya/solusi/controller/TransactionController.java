package test.inovasi.daya.solusi.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import test.inovasi.daya.solusi.constant.Endpoint;
import test.inovasi.daya.solusi.dto.request.TransactionRequest;
import test.inovasi.daya.solusi.dto.response.TransactionResponse;
import test.inovasi.daya.solusi.service.TransactionService;

import java.util.List;

@RestController
@RequestMapping(Endpoint.TRANSACTION)
@AllArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    @GetMapping
    public List<TransactionResponse> list() {
        return transactionService.list();
    }

    @PostMapping
    public TransactionResponse create(
            @RequestBody @Valid TransactionRequest request
    ) {
        return transactionService.create(request);
    }
}
