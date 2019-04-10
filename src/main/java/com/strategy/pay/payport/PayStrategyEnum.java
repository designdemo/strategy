package com.strategy.pay.payport;

/**
 * author:曲终、人散
 * Date:2019/4/10 23:05
 */
public enum  PayStrategyEnum {

    ALI_PAY("ALI_PAY",new AliPay()),
    JD_PAY("JD_PAY",new JDPay()),
    WECHAT_PAY("WECHAT_PAY",new WechatPay()),
    UNION_PAY("UNION_PAY",new UnionPay()),
    DEFAULT_PAY("DEFAULT_PAY",new AliPay());

    private String code;

    private PayMent payMent;

    PayStrategyEnum(String code, PayMent payMent) {
        this.code = code;
        this.payMent = payMent;
    }

    public static PayStrategyEnum getPayMent(String code){
        for ( PayStrategyEnum payStrategy: PayStrategyEnum.values()) {
            if(payStrategy.code == code){
                return payStrategy;
            }
        }
        return PayStrategyEnum.DEFAULT_PAY;
    }

    public PayMent getPayMent() {
        return payMent;
    }
}
