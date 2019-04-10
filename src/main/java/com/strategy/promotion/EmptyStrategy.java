package com.strategy.promotion;

/**
 * author:曲终、人散
 * Date:2019/4/10 21:36
 */
public class EmptyStrategy implements PromotionStrategy {

    public void doPromotion() {
        System.out.println("无优惠");
    }

}
