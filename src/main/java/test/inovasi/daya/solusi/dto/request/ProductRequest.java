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
public class ProductRequest {

    @NotNull(message = Constant.PRODUCT_NAME_REQUIRED)
    @NotEmpty(message = Constant.PRODUCT_NAME_REQUIRED)
    private String name;
}
