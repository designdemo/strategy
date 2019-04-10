package com.strategy.pay.payport;

/**
 * author:曲终、人散
 * Date:2019/4/10 22:26
 */
public class JDPay extends PayMent {
    public String getName() {
        return "京东";
    }

    protected double queryBalances(String uid) {
        return 256;
    }
}
