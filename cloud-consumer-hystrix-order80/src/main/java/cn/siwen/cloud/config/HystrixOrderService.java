package cn.siwen.cloud.config;

import cn.siwen.cloud.config.impl.Feign_Hystrix;
import cn.siwen.cloud.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author shkstart
 * @create 2020-11-12 9:37
 * @email 251830091@qq.com
 */
@Component
@FeignClient(value = "CLOUD-HYSTRIX-PAYMENT",fallback = Feign_Hystrix.class) //添加@FeignClient注解,指定服务提供方服务名称
public interface HystrixOrderService {
    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id);

}
