package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 财政支出对象 finance
 * 
 * @author shiwei
 * @date 2021-02-23
 */
public class Finance extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long financeId;

    /**  */
    private Long delFlag;

    /** 收入 */
    @Excel(name = "收入")
    private Long finIncome;

    /** 支出 */
    @Excel(name = "支出")
    private Long finExpenditure;

    public void setFinanceId(Long financeId) 
    {
        this.financeId = financeId;
    }

    public Long getFinanceId() 
    {
        return financeId;
    }
    public void setDelFlag(Long delFlag) 
    {
        this.delFlag = delFlag;
    }

    public Long getDelFlag() 
    {
        return delFlag;
    }
    public void setFinIncome(Long finIncome) 
    {
        this.finIncome = finIncome;
    }

    public Long getFinIncome() 
    {
        return finIncome;
    }
    public void setFinExpenditure(Long finExpenditure) 
    {
        this.finExpenditure = finExpenditure;
    }

    public Long getFinExpenditure() 
    {
        return finExpenditure;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("financeId", getFinanceId())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .append("delFlag", getDelFlag())
            .append("finIncome", getFinIncome())
            .append("finExpenditure", getFinExpenditure())
            .toString();
    }
}
