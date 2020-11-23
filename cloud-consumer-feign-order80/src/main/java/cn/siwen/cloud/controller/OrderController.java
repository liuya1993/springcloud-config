package cn.siwen.cloud.controller;

import cn.siwen.cloud.config.PaymentFeignService;
import cn.siwen.cloud.entity.CommonResult;
import cn.siwen.cloud.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestOperations;

import javax.annotation.Resource;

/**
 * @author shkstart
 * @create 2020-11-04 8:36
 * @email 251830091@qq.com
 */
@RestController
public class OrderController {

    @Resource
  private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consume/order/{id}")
  public CommonResult orderfind(@PathVariable Long id){
      return  paymentFeignService.getPaymentById(id);

  }

/*  @GetMapping(value = "/consume/create")
  public CommonResult<Payment> orderCreate(
          Payment payment){
     return restTemplate.postForObject(PAYMENT_URL+"/payment/add",payment
             ,CommonResult.class);
  }*/

}
