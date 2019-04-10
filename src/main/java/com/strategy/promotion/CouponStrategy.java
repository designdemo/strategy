package com.strategy.promotion;

/**
 * 优惠券抵扣
 * author:曲终、人散
 * Date:2019/4/10 21:34
 */
public class CouponStrategy implements PromotionStrategy {

    public void doPromotion() {
        System.out.println("优惠券抵扣");
    }
}
