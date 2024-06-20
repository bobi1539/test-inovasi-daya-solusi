package test.inovasi.daya.solusi.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import test.inovasi.daya.solusi.constant.GlobalMessage;
import test.inovasi.daya.solusi.dto.request.TransactionRequest;
import test.inovasi.daya.solusi.dto.response.TransactionResponse;
import test.inovasi.daya.solusi.entity.Customer;
import test.inovasi.daya.solusi.entity.Product;
import test.inovasi.daya.solusi.entity.Transaction;
import test.inovasi.daya.solusi.exception.BusinessException;
import test.inovasi.daya.solusi.helper.EntityHelper;
import test.inovasi.daya.solusi.repository.CustomerRepository;
import test.inovasi.daya.solusi.repository.ProductRepository;
import test.inovasi.daya.solusi.repository.TransactionRepository;
import test.inovasi.daya.solusi.service.TransactionService;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;
    private final ProductRepository productRepository;
    private final CustomerRepository customerRepository;

    @Override
    public List<TransactionResponse> list() {
        List<Transaction> transactions = transactionRepository.findAll();
        return transactions.stream().map(EntityHelper::toTransactionResponse).toList();
    }

    @Override
    public TransactionResponse create(TransactionRequest request) {
        Product product = findProductById(request.getProductId());
        Customer customer = findCustomerById(request.getCustomerId());
        Transaction transaction = Transaction.builder()
                .product(product)
                .customer(customer)
                .amount(request.getAmount())
                .status(request.getStatus())
                .transactionDate(request.getTransactionDate())
                .createdBy("ABC")
                .createdOn(LocalDateTime.now())
                .build();
        transaction = transactionRepository.save(transaction);
        return EntityHelper.toTransactionResponse(transaction);
    }

    private Product findProductById(Long id) {
        return productRepository.findById(id).orElseThrow(
                () -> new BusinessException(GlobalMessage.PRODUCT_NOT_EXIST)
        );
    }

    private Customer findCustomerById(Long id) {
        return customerRepository.findById(id).orElseThrow(
                () -> new BusinessException(GlobalMessage.CUSTOMER_NOT_EXIST)
        );
    }
}
