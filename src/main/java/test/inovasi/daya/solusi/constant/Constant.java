package test.inovasi.daya.solusi.constant;

import test.inovasi.daya.solusi.exception.BusinessException;

public final class Constant {

    private Constant() {
        throw new BusinessException(GlobalMessage.CANNOT_INSTANCE_HELPER_CLASS);
    }

    public static final String ERROR = "Error : ";
    public static final String PRODUCT_NAME_REQUIRED = "Product Name Is Required";
    public static final String CUSTOMER_NAME_REQUIRED = "Customer Name Is Required";
    public static final String PRODUCT_ID_REQUIRED = "Product Id Is Required";
    public static final String CUSTOMER_ID_REQUIRED = "Customer Id Is Required";
    public static final String AMOUNT_REQUIRED = "Amount Is Required";
    public static final String STATUS_REQUIRED = "Status Is Required";
    public static final String TRANSACTION_DATE_REQUIRED = "Transaction Date Is Required";
}
