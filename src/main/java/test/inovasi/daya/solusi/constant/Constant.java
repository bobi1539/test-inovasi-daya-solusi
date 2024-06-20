package test.inovasi.daya.solusi.constant;

import test.inovasi.daya.solusi.exception.BusinessException;

public final class Constant {

    private Constant() {
        throw new BusinessException(GlobalMessage.CANNOT_INSTANCE_HELPER_CLASS);
    }

    public static final String ERROR = "Error : ";
}
