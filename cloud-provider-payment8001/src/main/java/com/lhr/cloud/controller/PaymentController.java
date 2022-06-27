package com.lhr.cloud.controller;

import com.lhr.cloud.entities.CommonResult;
import com.lhr.cloud.entities.Payment;
import com.lhr.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author lhr
 * @Date:2022/6/26 21:29
 * @Version 1.0
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping("/create")
    public CommonResult<Payment> create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("******插入结果："+result);
        if (result > 0){
            return new CommonResult(200,"ok",result);
        }
        else {
            return new CommonResult(444,"失败",null);
        }
    }

    @GetMapping(value = "/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        Payment payment = paymentService.getPaymentById(id);
        if(payment != null)
        {
            return new CommonResult(200,"查询成功1111,serverPort:  ",payment);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID: "+id,null);
        }
    }
}
