package test.inovasi.daya.solusi.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import test.inovasi.daya.solusi.dto.response.TransactionResponse;
import test.inovasi.daya.solusi.entity.Transaction;
import test.inovasi.daya.solusi.helper.EntityHelper;
import test.inovasi.daya.solusi.repository.TransactionRepository;
import test.inovasi.daya.solusi.service.TransactionService;

import java.util.List;

@Service
@AllArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    @Override
    public List<TransactionResponse> list() {
        List<Transaction> transactions = transactionRepository.findAll();
        return transactions.stream().map(EntityHelper::toTransactionResponse).toList();
    }
}
