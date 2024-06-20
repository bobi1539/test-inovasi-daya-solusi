package test.inovasi.daya.solusi.constant;

import org.springframework.http.HttpStatus;

public enum GlobalMessage {
    SUCCESS(HttpStatus.OK, "Success"),
    PRODUCT_NOT_EXIST(HttpStatus.BAD_REQUEST, "Produk Not Exist"),
    CUSTOMER_NOT_EXIST(HttpStatus.BAD_REQUEST, "Customer Not Exist"),
    CANNOT_INSTANCE_HELPER_CLASS(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error"),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error");
    public final HttpStatus httpStatus;
    public final String message;

    GlobalMessage(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }
}
