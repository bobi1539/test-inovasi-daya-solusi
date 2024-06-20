package test.inovasi.daya.solusi.service;

import test.inovasi.daya.solusi.dto.request.TransactionRequest;
import test.inovasi.daya.solusi.dto.response.TransactionResponse;

import java.util.List;

public interface TransactionService {

    List<TransactionResponse> list();

    TransactionResponse create(TransactionRequest request);
}
