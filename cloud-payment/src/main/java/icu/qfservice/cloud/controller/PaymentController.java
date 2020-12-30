package icu.qfservice.cloud.controller;

import icu.qfservice.cloud.pojo.Payment;
import icu.qfservice.cloud.pojo.model.ResResult;
import icu.qfservice.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public ResResult create(@RequestBody Payment payment){
        int result = this.paymentService.create(payment);
        log.info("******插入结果"+result);
        if(result>0){
            return new ResResult(200,"插入成功",result);
        }else {
            return new ResResult(400,"插入数据库失败");
        }
    }

    @GetMapping("/payment/get/{id}")
    public ResResult getPaymentById(@PathVariable("id") Long id){
        Payment result = this.paymentService.getPaymentById(id);
        log.info("******查询结果"+result);
        if(result != null){
            return new ResResult(200,"查询成功1",result);
        }else {
            return new ResResult(400,"查询数据库失败");
        }
    }
}

