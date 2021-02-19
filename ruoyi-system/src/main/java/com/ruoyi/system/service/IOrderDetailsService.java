package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.OrderDetails;

/**
 * 订单详情Service接口
 * 
 * @author ruoyi
 * @date 2021-02-19
 */
public interface IOrderDetailsService 
{
    /**
     * 查询订单详情
     * 
     * @param orderDetailsId 订单详情ID
     * @return 订单详情
     */
    public OrderDetails selectOrderDetailsById(Long orderDetailsId);

    /**
     * 查询订单详情列表
     * 
     * @param orderDetails 订单详情
     * @return 订单详情集合
     */
    public List<OrderDetails> selectOrderDetailsList(OrderDetails orderDetails);

    /**
     * 新增订单详情
     * 
     * @param orderDetails 订单详情
     * @return 结果
     */
    public int insertOrderDetails(OrderDetails orderDetails);

    /**
     * 修改订单详情
     * 
     * @param orderDetails 订单详情
     * @return 结果
     */
    public int updateOrderDetails(OrderDetails orderDetails);

    /**
     * 批量删除订单详情
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteOrderDetailsByIds(String ids);

    /**
     * 删除订单详情信息
     * 
     * @param orderDetailsId 订单详情ID
     * @return 结果
     */
    public int deleteOrderDetailsById(Long orderDetailsId);
}
