package com.strategy.pay;

/**
 * author:曲终、人散
 * Date:2019/4/10 22:18
 */
public class PayStatus {

    private int code;

    private Object data;

    private String msg;

    public PayStatus(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return ("支付状态：【"+code+"】,"+msg+",交易详情："+data);
    }
}
