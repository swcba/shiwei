package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.FinanceMapper;
import com.ruoyi.system.domain.Finance;
import com.ruoyi.system.service.IFinanceService;
import com.ruoyi.common.core.text.Convert;

/**
 * 财政支出Service业务层处理
 * 
 * @author shiwei
 * @date 2021-02-23
 */
@Service
public class FinanceServiceImpl implements IFinanceService 
{
    @Autowired
    private FinanceMapper financeMapper;

    /**
     * 查询财政支出
     * 
     * @param financeId 财政支出ID
     * @return 财政支出
     */
    @Override
    public Finance selectFinanceById(Long financeId)
    {
        return financeMapper.selectFinanceById(financeId);
    }

    /**
     * 查询财政支出列表
     * 
     * @param finance 财政支出
     * @return 财政支出
     */
    @Override
    public List<Finance> selectFinanceList(Finance finance)
    {
        return financeMapper.selectFinanceList(finance);
    }

    /**
     * 新增财政支出
     * 
     * @param finance 财政支出
     * @return 结果
     */
    @Override
    public int insertFinance(Finance finance)
    {
        finance.setCreateTime(DateUtils.getNowDate());
        return financeMapper.insertFinance(finance);
    }

    /**
     * 修改财政支出
     * 
     * @param finance 财政支出
     * @return 结果
     */
    @Override
    public int updateFinance(Finance finance)
    {
        finance.setUpdateTime(DateUtils.getNowDate());
        return financeMapper.updateFinance(finance);
    }

    /**
     * 删除财政支出对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFinanceByIds(String ids)
    {
        return financeMapper.deleteFinanceByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除财政支出信息
     * 
     * @param financeId 财政支出ID
     * @return 结果
     */
    @Override
    public int deleteFinanceById(Long financeId)
    {
        return financeMapper.deleteFinanceById(financeId);
    }
}
