package icu.qfservice.cloud.service.impl;

import icu.qfservice.cloud.dto.PaymentMapper;
import icu.qfservice.cloud.pojo.Payment;
import icu.qfservice.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return this.paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return this.paymentMapper.getPaymentById(id);
    }
}
