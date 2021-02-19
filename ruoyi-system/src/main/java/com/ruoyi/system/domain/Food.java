package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 菜单对象 food
 * 
 * @author ruoyi
 * @date 2021-02-19
 */
public class Food extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long foodId;

    /** 菜名 */
    @Excel(name = "菜名")
    private String foodName;

    /** 菜品属性 */
    @Excel(name = "菜品属性")
    private String foodSate;

    /** 菜品描述 */
    @Excel(name = "菜品描述")
    private String foodDescribe;

    /** 价格 */
    @Excel(name = "价格")
    private String foodPrice;

    public void setFoodId(Long foodId) 
    {
        this.foodId = foodId;
    }

    public Long getFoodId() 
    {
        return foodId;
    }
    public void setFoodName(String foodName) 
    {
        this.foodName = foodName;
    }

    public String getFoodName() 
    {
        return foodName;
    }
    public void setFoodSate(String foodSate) 
    {
        this.foodSate = foodSate;
    }

    public String getFoodSate() 
    {
        return foodSate;
    }
    public void setFoodDescribe(String foodDescribe) 
    {
        this.foodDescribe = foodDescribe;
    }

    public String getFoodDescribe() 
    {
        return foodDescribe;
    }
    public void setFoodPrice(String foodPrice) 
    {
        this.foodPrice = foodPrice;
    }

    public String getFoodPrice() 
    {
        return foodPrice;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("foodId", getFoodId())
            .append("foodName", getFoodName())
            .append("foodSate", getFoodSate())
            .append("foodDescribe", getFoodDescribe())
            .append("updateBy", getUpdateBy())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("foodPrice", getFoodPrice())
            .toString();
    }
}
