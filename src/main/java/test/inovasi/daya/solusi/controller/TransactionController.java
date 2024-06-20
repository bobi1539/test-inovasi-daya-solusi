package test.inovasi.daya.solusi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.inovasi.daya.solusi.constant.Endpoint;
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
}
