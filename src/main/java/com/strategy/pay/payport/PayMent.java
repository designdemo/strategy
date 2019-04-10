package com.strategy.pay.payport;

import com.strategy.pay.PayStatus;

/**
 * author:曲终、人散
 * Date:2019/4/10 22:21
 */
public abstract class PayMent {

    //支付类型
    public abstract String getName();

    //查询余额
    protected abstract double queryBalances(String uid);

    //扣款支付
    public PayStatus pay(String uid, double amount){
        if(queryBalances(uid) < amount){
            return new PayStatus(500,"支付失败","余额不足");
        }
        return new PayStatus(200,"支付成功","正在扣款");
    }




}
