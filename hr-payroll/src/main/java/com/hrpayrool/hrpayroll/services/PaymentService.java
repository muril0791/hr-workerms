package com.hrpayrool.hrpayroll.services;
import org.springframework.stereotype.Service;
import com.hrpayrool.hrpayroll.entities.Payment;

@Service
public class PaymentService {
    
    public Payment getPayment(long workedId, int days){
        return new Payment("murilo", 80.0, days);
    }

}
