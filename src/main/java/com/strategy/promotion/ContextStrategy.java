package com.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * 环境角色
 * author:曲终、人散
 * Date:2019/4/10 21:39
 */
public class ContextStrategy {

    private static final Map<String,PromotionStrategy> context = new HashMap<String, PromotionStrategy>();

    static{
        context.put(PromotionKey.CASHBLACK,new CashBlackStrategy());
        context.put(PromotionKey.COUPON,new CouponStrategy());
        context.put(PromotionKey.GROUPBUY,new GroupBuyStrategy());
    }

    //默认无优惠的支付方式
    private static final EmptyStrategy defult = new EmptyStrategy();

    private ContextStrategy(){}

    public static PromotionStrategy getPromotion(String promotionName){
        PromotionStrategy promotionStrategy = context.get(promotionName);
        return promotionStrategy==null?defult:promotionStrategy;
    }

    private interface PromotionKey{
        String CASHBLACK = "CASHBLACK";
        String COUPON = "COUPON";
        String GROUPBUY = "GROUPBUY";
    }
}
