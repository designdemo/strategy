package com.strategy.pay.payport;

import com.strategy.pay.payport.PayMent;

/**
 * author:曲终、人散
 * Date:2019/4/10 22:26
 */
public class WechatPay extends PayMent {
    public String getName() {
        return "微信";
    }

    protected double queryBalances(String uid) {
        return 300;
    }
}
