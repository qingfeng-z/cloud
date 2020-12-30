package icu.qfservice.cloud.controller;

import icu.qfservice.cloud.pojo.Payment;
import icu.qfservice.cloud.pojo.model.ResResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderController {

    private static final String PAYMENT_BASE_URL = "http://localhost:8001";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("consumer/payment/create")
    public ResResult create(Payment payment){
        return restTemplate.postForObject(PAYMENT_BASE_URL+"/payment/create",payment,ResResult.class);
    }

    @GetMapping("consumer/payment/get/{id}")
    public ResResult getPaymentById(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_BASE_URL+"/payment/get/"+id,ResResult.class);
    }
}
