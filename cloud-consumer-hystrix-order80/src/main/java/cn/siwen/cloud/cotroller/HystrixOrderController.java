package cn.siwen.cloud.cotroller;

import cn.siwen.cloud.config.HystrixOrderService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author shkstart
 * @create 2020-11-16 10:14
 * @email 251830091@qq.com
 */
@RestController
@DefaultProperties(defaultFallback = "order_Hystrix_defaultFallback")
public class HystrixOrderController {
    @Resource
    HystrixOrderService hystrixOrderService;
    @GetMapping("/payment/hystrix/ok/{id}")
    @HystrixCommand
    public String paymentInfo_OK(@PathVariable("id") Integer id){
       return   hystrixOrderService.paymentInfo_OK(id);
    }

    @GetMapping("/payment/hystrix/timeout/{id}")
    @HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")  //1.5秒钟以内就是正常的业务逻辑
    })
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        return   hystrixOrderService.paymentInfo_TimeOut(id);
    }

    public String paymentTimeOutFallbackMethod(Integer id){
        return "降级了！！！！！！！";
    }


    public String order_Hystrix_defaultFallback(){
        return "系统繁忙，请稍后访问!";
    }

}
