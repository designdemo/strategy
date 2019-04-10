package com.strategy.pay;

import com.strategy.pay.payport.PayMent;
import com.strategy.pay.payport.PayStrategy;

/**
 * author:曲终、人散
 * Date:2019/4/10 22:17
 */
public class Order {
    private String uid;

    private String OrderId;

    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        OrderId = orderId;
        this.amount = amount;
    }

    public PayStatus pay(){
        return pay(PayStrategy.DEFAULT_PAY);
    }

    public PayStatus pay(String payKey) {

        PayMent payMent = PayStrategy.getPayMent(payKey);
        System.out.println("欢迎使用 "+payMent.getName());
        System.out.println("本次交易金额为： "+ amount + ",正在扣款。。。");
        return payMent.pay(uid,amount);
    }
}
