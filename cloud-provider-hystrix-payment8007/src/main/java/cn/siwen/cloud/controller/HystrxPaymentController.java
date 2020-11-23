package cn.siwen.cloud.controller;

import cn.siwen.cloud.service.HystrixPaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author shkstart
 * @create 2020-11-16 9:26
 * @email 251830091@qq.com
 */
@RestController
public class HystrxPaymentController {
    @Resource
    HystrixPaymentService hystrixPaymentService;

    @GetMapping(value = "/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable  Integer id) {
        return hystrixPaymentService.paymentInfo_OK(id);
    }

    //timeout超时
    @GetMapping(value = "/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable Integer id) {
           return  hystrixPaymentService.paymentInfo_TimeOut(id);
    }

    //服务熔断
    @GetMapping(value = "/payment/hystrix/breaker/{id}")
    public String paymentInfo_breaker(@PathVariable Integer id) {
        return  hystrixPaymentService.paymentCircuitBreaker(id);
    }
}
