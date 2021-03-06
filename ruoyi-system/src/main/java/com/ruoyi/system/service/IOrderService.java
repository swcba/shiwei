package com.ruoyi.system.service;

import com.ruoyi.system.domain.Order;
import com.ruoyi.system.domain.OrderStatistics;

import java.util.List;

/**
 * 订单Service接口
 * 
 * @author shiwei
 * @date 2021-02-19
 */
public interface IOrderService 
{
    /**
     * 查询订单
     * 
     * @param orderId 订单ID
     * @return 订单
     */
    public Order selectOrderById(Long orderId);

    /**
     * 查询订单列表
     * 
     * @param order 订单
     * @return 订单集合
     */
    public List<Order> selectOrderList(Order order);

    /**
     * 新增订单
     * 
     * @param order 订单
     * @return 结果
     */
    public int insertOrder(Order order);

    /**
     * 修改订单
     * 
     * @param order 订单
     * @return 结果
     */
    public int updateOrder(Order order);

    /**
     * 批量删除订单
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteOrderByIds(String ids);

    /**
     * 删除订单信息
     * 
     * @param orderId 订单ID
     * @return 结果
     */
    public int deleteOrderById(Long orderId);

    /**
     *查询订单数目
     *
     * @param flag
     *
     * @return: java.lang.Long
     * @author: shiwei1
     * @date:  2021/2/25/10:58
     */
    Long selectOrderNum(Integer flag);

    /**
     *根据年月日查询订单信息
     *
     * @param flag
     *
     * @return: java.util.List<Order>
     * @author: shiwei1
     * @date:  2021/2/26/9:52
     */

    OrderStatistics selectOrderStatistics(Integer flag);
}
