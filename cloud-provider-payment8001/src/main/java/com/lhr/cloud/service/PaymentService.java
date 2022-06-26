package com.lhr.cloud.service;

import com.lhr.cloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author lhr
 * @Date:2022/6/26 21:24
 * @Version 1.0
 */

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
