package test.inovasi.daya.solusi.helper;

import test.inovasi.daya.solusi.constant.GlobalMessage;
import test.inovasi.daya.solusi.dto.response.CustomerResponse;
import test.inovasi.daya.solusi.dto.response.ProductResponse;
import test.inovasi.daya.solusi.dto.response.TransactionResponse;
import test.inovasi.daya.solusi.entity.Customer;
import test.inovasi.daya.solusi.entity.Product;
import test.inovasi.daya.solusi.entity.Transaction;
import test.inovasi.daya.solusi.exception.BusinessException;

public final class EntityHelper {

    private EntityHelper() {
        throw new BusinessException(GlobalMessage.CANNOT_INSTANCE_HELPER_CLASS);
    }

    public static TransactionResponse toTransactionResponse(Transaction transaction) {
        return TransactionResponse.builder()
                .id(transaction.getId())
                .productID(transaction.getProduct().getId())
                .productName(transaction.getProduct().getName())
                .amount(transaction.getAmount())
                .customerName(transaction.getCustomer().getName())
                .status(transaction.getStatus())
                .transactionDate(transaction.getTransactionDate())
                .createdBy(transaction.getCreatedBy())
                .createdOn(transaction.getCreatedOn())
                .build();
    }

    public static ProductResponse toProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .build();
    }

    public static CustomerResponse toCustomerResponse(Customer customer) {
        return CustomerResponse.builder()
                .id(customer.getId())
                .name(customer.getName())
                .build();
    }
}
