package test.inovasi.daya.solusi.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import test.inovasi.daya.solusi.constant.Constant;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TransactionRequest {

    @NotNull(message = Constant.PRODUCT_ID_REQUIRED)
    private Long productId;

    @NotNull(message = Constant.CUSTOMER_ID_REQUIRED)
    private Long customerId;

    @NotNull(message = Constant.AMOUNT_REQUIRED)
    private Double amount;

    @NotNull(message = Constant.STATUS_REQUIRED)
    private Integer status;

    @NotNull(message = Constant.TRANSACTION_DATE_REQUIRED)
    private LocalDateTime transactionDate;
}
