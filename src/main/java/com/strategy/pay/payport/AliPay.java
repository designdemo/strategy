package com.strategy.pay.payport;

/**
 * author:曲终、人散
 * Date:2019/4/10 22:26
 */
public class AliPay extends PayMent {
    public String getName() {
        return "支付宝";
    }

    protected double queryBalances(String uid) {
        return 500;
    }
}
