package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Finance;

/**
 * 财政支出Service接口
 * 
 * @author shiwei
 * @date 2021-02-23
 */
public interface IFinanceService 
{
    /**
     * 查询财政支出
     * 
     * @param financeId 财政支出ID
     * @return 财政支出
     */
    public Finance selectFinanceById(Long financeId);

    /**
     * 查询财政支出列表
     * 
     * @param finance 财政支出
     * @return 财政支出集合
     */
    public List<Finance> selectFinanceList(Finance finance);

    /**
     *
     *查询当月收入
     *
     * @return: java.util.List<com.ruoyi.system.domain.Finance>
     */
    public List<Finance> selectFinanceByMonth();
     /**
     * 新增财政支出
     * 
     * @param finance 财政支出
     * @return 结果
     */
    public int insertFinance(Finance finance);

    /**
     * 修改财政支出
     * 
     * @param finance 财政支出
     * @return 结果
     */
    public int updateFinance(Finance finance);

    /**
     * 批量删除财政支出
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFinanceByIds(String ids);

    /**
     * 删除财政支出信息
     * 
     * @param financeId 财政支出ID
     * @return 结果
     */
    public int deleteFinanceById(Long financeId);


}
