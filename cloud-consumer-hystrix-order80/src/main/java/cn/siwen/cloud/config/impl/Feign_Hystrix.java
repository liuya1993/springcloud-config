package cn.siwen.cloud.config.impl;

import cn.siwen.cloud.config.FeignConfig;
import cn.siwen.cloud.config.HystrixOrderService;

/**
 * @author shkstart
 * @create 2020-11-19 8:20
 * @email 251830091@qq.com
 */
public class Feign_Hystrix implements HystrixOrderService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "服务降级方法！！！";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "服务降级方法！！！";
    }
}
