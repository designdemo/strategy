package com.strategy.pay.payport;

import com.strategy.pay.payport.PayMent;

/**
 * author:曲终、人散
 * Date:2019/4/10 22:26
 */
public class UnionPay extends PayMent {
    public String getName() {
        return "银联";
    }

    protected double queryBalances(String uid) {
        return 99;
    }
}
