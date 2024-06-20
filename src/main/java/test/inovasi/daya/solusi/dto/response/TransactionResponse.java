package test.inovasi.daya.solusi.dto.response;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TransactionResponse {
    private Long id;
    private Long productID;
    private String productName;
    private Double amount;
    private String customerName;
    private Integer status;
    private LocalDateTime transactionDate;
    private String createdBy;
    private LocalDateTime createdOn;
}
