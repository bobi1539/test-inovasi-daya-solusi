package test.inovasi.daya.solusi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.inovasi.daya.solusi.constant.Endpoint;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(Endpoint.TRANSACTION)
public class TransactionController {

    @GetMapping
    public Map<String, String> test() {
        Map<String, String> map = new HashMap<>();
        map.put("Hello", "Dunia");
        return map;
    }
}
