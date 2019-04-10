package com.strategy.pay;

import com.strategy.pay.payport.PayStrategy;

/**
 * author:曲终、人散
 * Date:2019/4/10 22:37
 */
public class PayStrategyTest {

    public static void main(String[] args) {
        Order order = new Order("1","sdfsadfasdfasdfs",560);

        PayStatus pay = order.pay(PayStrategy.UNION_PAY);
        System.out.println(pay);


    }
}
