package com.lhr.cloud.service.impl;

import com.lhr.cloud.dao.PaymentDao;
import com.lhr.cloud.entities.Payment;
import com.lhr.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lhr
 * @Date:2022/6/26 21:24
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
