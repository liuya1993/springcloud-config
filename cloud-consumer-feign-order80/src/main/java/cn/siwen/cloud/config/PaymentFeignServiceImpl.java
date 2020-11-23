package cn.siwen.cloud.config;

import cn.siwen.cloud.entity.CommonResult;
import cn.siwen.cloud.entity.Payment;

/**
 * @author shkstart
 * @create 2020-11-12 9:39
 * @email 251830091@qq.com
 */
public class PaymentFeignServiceImpl  implements  PaymentFeignService{
    @Override
    public CommonResult getPaymentById(Long id) {
        return new CommonResult(404, "OpenFeign兜底方法", new Payment(id, "errorSerial"));
    }
}
