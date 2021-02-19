package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 订单对象 order
 * 
 * @author ruoyi
 * @date 2021-02-19
 */
public class Order extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long orderId;

    /** 订单描述 */
    @Excel(name = "订单描述")
    private String orderDescribe;

    /** 删除标识 */
    private Long delFlag;

    /** 订单编号 */
    @Excel(name = "订单编号")
    private String orderNumber;

    /** 订单状态 */
    @Excel(name = "订单状态")
    private Long orderState;

    /** 总价格 */
    @Excel(name = "总价格")
    private Long orderPrice;

    /** 菜品数量 */
    @Excel(name = "菜品数量")
    private Long foodNumber;

    /** 支付方式 */
    @Excel(name = "支付方式")
    private Long payWay;

    public void setOrderId(Long orderId) 
    {
        this.orderId = orderId;
    }

    public Long getOrderId() 
    {
        return orderId;
    }
    public void setOrderDescribe(String orderDescribe) 
    {
        this.orderDescribe = orderDescribe;
    }

    public String getOrderDescribe() 
    {
        return orderDescribe;
    }
    public void setDelFlag(Long delFlag) 
    {
        this.delFlag = delFlag;
    }

    public Long getDelFlag() 
    {
        return delFlag;
    }
    public void setOrderNumber(String orderNumber) 
    {
        this.orderNumber = orderNumber;
    }

    public String getOrderNumber() 
    {
        return orderNumber;
    }
    public void setOrderState(Long orderState) 
    {
        this.orderState = orderState;
    }

    public Long getOrderState() 
    {
        return orderState;
    }
    public void setOrderPrice(Long orderPrice) 
    {
        this.orderPrice = orderPrice;
    }

    public Long getOrderPrice() 
    {
        return orderPrice;
    }
    public void setFoodNumber(Long foodNumber) 
    {
        this.foodNumber = foodNumber;
    }

    public Long getFoodNumber() 
    {
        return foodNumber;
    }
    public void setPayWay(Long payWay) 
    {
        this.payWay = payWay;
    }

    public Long getPayWay() 
    {
        return payWay;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("orderId", getOrderId())
            .append("updateBy", getUpdateBy())
            .append("createTime", getCreateTime())
            .append("orderDescribe", getOrderDescribe())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("delFlag", getDelFlag())
            .append("orderNumber", getOrderNumber())
            .append("orderState", getOrderState())
            .append("orderPrice", getOrderPrice())
            .append("foodNumber", getFoodNumber())
            .append("payWay", getPayWay())
            .append("remark", getRemark())
            .toString();
    }
}
