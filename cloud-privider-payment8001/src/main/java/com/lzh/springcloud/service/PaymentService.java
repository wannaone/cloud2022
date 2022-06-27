package com.lzh.springcloud.service;

import com.lzh.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

/**
 * @Author lvzhuanghu
 * @Description //TODO
 * @PackageName com.lzh.springcloud.service
 * @Date 2022-05-17$
 */

public interface PaymentService {

    int create(Payment payment) ;

    Payment getPaymentById(Long id);
}
