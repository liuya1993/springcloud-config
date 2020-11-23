package cn.siwen.cloud.controller;

import cn.siwen.cloud.entity.CommonResult;
import cn.siwen.cloud.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

/**
 * @author shkstart
 * @create 2020-11-04 8:36
 * @email 251830091@qq.com
 */
@RestController
public class OrderController {

    public static final String PAYMENT_URL = "http://PAYMENT";
    @Autowired
  private RestOperations restTemplate;

    @GetMapping(value = "/consume/order/{id}")
  public CommonResult orderfind(@PathVariable long id){
      return   restTemplate.getForObject(PAYMENT_URL+"/payment/find/"+id,CommonResult.class,id);
  }

  @GetMapping(value = "/consume/create")
  public CommonResult<Payment> orderCreate(
          Payment payment){
     return restTemplate.postForObject(PAYMENT_URL+"/payment/add",payment
             ,CommonResult.class);
  }

}
