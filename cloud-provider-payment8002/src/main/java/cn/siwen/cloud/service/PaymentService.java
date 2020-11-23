package cn.siwen.cloud.service;

import cn.siwen.cloud.entity.Payment;

/**
 * @author shkstart
 * @create 2020-11-02 9:27
 * @email 251830091@qq.com
 */
public interface PaymentService {

    public  int addPayment(Payment payment);

    public Payment findPaymentById(long id);
}
