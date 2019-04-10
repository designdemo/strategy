package com.strategy.promotion;

/**
 * author:曲终、人散
 * Date:2019/4/10 21:49
 */
public class ProtionStrategyTest {
    public static void main(String[] args) {

//        String promotionKey = "CASHBLACK";
//        String promotionKey2 = "COUPON";
//        String promotionKey3 = "GROUPBUY";
//        String promotionKey4 = "test";
//
//        PromotionStrategy promotion = ContextStrategy.getPromotion(promotionKey4);
//        promotion.doPromotion();


        Integer code = 5;

        PromotionStrategy promotionStrategy = PromotionKeyEnum.getPromotionStrategy(code);
        promotionStrategy.doPromotion();

    }


}
