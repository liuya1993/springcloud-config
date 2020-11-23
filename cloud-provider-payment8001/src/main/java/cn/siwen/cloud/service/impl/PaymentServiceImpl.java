package cn.siwen.cloud.service.impl;

import cn.siwen.cloud.dao.PaymentDao;
import cn.siwen.cloud.entity.Payment;
import cn.siwen.cloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shkstart
 * @create 2020-11-02 9:28
 * @email 251830091@qq.com
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;


    public int addPayment(Payment payment) {
        return paymentDao.addPayment(payment);
    }

    @Override
    public Payment findPaymentById(long id) {
        return paymentDao.findPaymentById(id);
    }

}
