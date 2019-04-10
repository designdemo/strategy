package com.strategy.pay.payport;

import com.strategy.pay.payport.*;

import java.util.HashMap;
import java.util.Map;

/**
 * author:曲终、人散
 * Date:2019/4/10 22:29
 */
public class PayStrategy {

    public static String ALI_PAY = "ALIPAY";
    public static String JD_PAY = "JDPAY";
    public static String WECHAT_PAY = "WECHATPAY";
    public static String UNION_PAY = "UNIONPAY";
    public static String DEFAULT_PAY = "DEFAULTPAY";

    private static Map<String, PayMent> PAY_MENT_MAP = new HashMap<String,PayMent>();

    static {
        PAY_MENT_MAP.put(ALI_PAY,new AliPay());
        PAY_MENT_MAP.put(JD_PAY,new JDPay());
        PAY_MENT_MAP.put(WECHAT_PAY,new WechatPay());
        PAY_MENT_MAP.put(UNION_PAY,new UnionPay());
        PAY_MENT_MAP.put(DEFAULT_PAY,new AliPay());
    }

    public static PayMent getPayMent(String payKey){
        PayMent payMent = PAY_MENT_MAP.get(payKey);
        return payMent == null ? PAY_MENT_MAP.get(DEFAULT_PAY) : payMent;
    }
}
