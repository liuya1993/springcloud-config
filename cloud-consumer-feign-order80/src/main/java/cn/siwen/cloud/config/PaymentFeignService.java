package cn.siwen.cloud.config;

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
@FeignClient(value = "payment") //添加@FeignClient注解,指定服务提供方服务名称
public interface PaymentFeignService {
    @GetMapping(value = "/payment/find/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);//该接口声明必须和服务提供方一致

}
