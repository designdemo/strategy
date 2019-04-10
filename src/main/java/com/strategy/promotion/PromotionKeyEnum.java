package com.strategy.promotion;

/**
 * 枚举的方式
 * author:曲终、人散
 * Date:2019/4/10 21:53
 */
public enum  PromotionKeyEnum {

     CASHBLACK(1,new CashBlackStrategy()),
     COUPON(2,new CouponStrategy()),
     GROUPBUY(3,new GroupBuyStrategy()),
     DEFULT(4,new EmptyStrategy());

     private Integer code;

     private PromotionStrategy promotionStrategy;

    PromotionKeyEnum(Integer code, PromotionStrategy promotionStrategy) {
        this.code = code;
        this.promotionStrategy = promotionStrategy;
    }

    public static PromotionStrategy getPromotionStrategy(Integer code){
        for (PromotionKeyEnum promotionKeyEnum: PromotionKeyEnum.values()) {
            if(promotionKeyEnum.code == code){
                return promotionKeyEnum.getPromotionStrategy();
            }
        }
        return PromotionKeyEnum.DEFULT.getPromotionStrategy();
    }

    public PromotionStrategy getPromotionStrategy() {
        return promotionStrategy;
    }
}
