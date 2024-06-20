package test.inovasi.daya.solusi.dto.request;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import test.inovasi.daya.solusi.constant.Constant;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CustomerRequest {

    @NotNull(message = Constant.CUSTOMER_NAME_REQUIRED)
    @NotEmpty(message = Constant.CUSTOMER_NAME_REQUIRED)
    private String name;
}
