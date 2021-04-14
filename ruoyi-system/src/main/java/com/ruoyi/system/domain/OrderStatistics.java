package com.ruoyi.system.domain;/****************************************************
 * 创建人：     @author shiwei1    
 * 创建时间: 2021/4/7/13:54
 * 项目名称：  demo
 * 文件名称: null.java
 * 文件描述: @Description: 订单信息类(用一句话描述该文件做什么)
 *
 * All rights Reserved, Designed By 投资交易团队
 * @Copyright:2016-2021
 *
 ********************************************************/


import lombok.Data;

/**
 * 包名称：com.ruoyi.system.domain
 * 类名称：OrderStatistics
 * 类描述：订单信息类
 * 创建人：@author shiwei1
 * 创建时间：2021/4/7/13:54
 */

@Data
public class OrderStatistics {

    /**
     * 销量
     */
    private Long orders;

    /**
     * 销售额
     */
    private Long orderPrices;

    public OrderStatistics() {
    }

    public OrderStatistics(Long orders, Long orderPrice) {
        this.orders = orders;
        this.orderPrices = orderPrice;
    }
}
