package test.inovasi.daya.solusi.constant;

import test.inovasi.daya.solusi.exception.BusinessException;

public final class Constant {

    private Constant() {
        throw new BusinessException(GlobalMessage.CANNOT_INSTANCE_HELPER_CLASS);
    }

    public static final String ERROR = "Error : ";
    public static final String PRODUCT_NAME_REQUIRED = "PRODUCT NAME IS REQUIRED";
    public static final String CUSTOMER_NAME_REQUIRED = "CUSTOMER NAME IS REQUIRED";
}
