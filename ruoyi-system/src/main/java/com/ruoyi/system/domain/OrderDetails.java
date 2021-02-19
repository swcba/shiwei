package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 订单详情对象 order_details
 * 
 * @author ruoyi
 * @date 2021-02-19
 */
public class OrderDetails extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long orderDetailsId;

    /** 删除标识 */
    private Long delFlag;

    /** 订单编号 */
    @Excel(name = "订单编号")
    private String orderNumber;

    /** 菜品数量 */
    @Excel(name = "菜品数量")
    private Long foodNumber;

    /** 菜品id */
    @Excel(name = "菜品id")
    private Long foodId;

    public void setOrderDetailsId(Long orderDetailsId) 
    {
        this.orderDetailsId = orderDetailsId;
    }

    public Long getOrderDetailsId() 
    {
        return orderDetailsId;
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
    public void setFoodNumber(Long foodNumber) 
    {
        this.foodNumber = foodNumber;
    }

    public Long getFoodNumber() 
    {
        return foodNumber;
    }
    public void setFoodId(Long foodId) 
    {
        this.foodId = foodId;
    }

    public Long getFoodId() 
    {
        return foodId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("orderDetailsId", getOrderDetailsId())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .append("delFlag", getDelFlag())
            .append("orderNumber", getOrderNumber())
            .append("foodNumber", getFoodNumber())
            .append("foodId", getFoodId())
            .toString();
    }
}
