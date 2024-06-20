package test.inovasi.daya.solusi.constant;

import test.inovasi.daya.solusi.exception.BusinessException;

public final class Endpoint {

    private Endpoint() {
        throw new BusinessException(GlobalMessage.CANNOT_INSTANCE_HELPER_CLASS);
    }

    public static final String BASE_ENDPOINT = "/api";
    public static final String TRANSACTION = BASE_ENDPOINT + "/transactions";
}
