package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单Mapper接口
 * 
 * @author shiwei
 * @date 2021-02-19
 */
public interface OrderMapper 
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
     * 删除订单
     * 
     * @param orderId 订单ID
     * @return 结果
     */
    public int deleteOrderById(Long orderId);

    /**
     * 批量删除订单
     * 
     * @param orderIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteOrderByIds(String[] orderIds);

    /**
     *查询订单数目
     *
     * @param flag
     * @param time
     *
     * @return: java.lang.Long
     * @author: shiwei1
     * @date:  2021/2/25/11:02
     */
    Long selectOrderNum(@Param("flag") Integer flag, @Param("time") Integer time);


    /**
     *根据年月日查询订单信息
     *
     *
     * @param year
     * @param month
     * @param day
     *
     * @return: java.util.List<Order>
     * @author: shiwei1
     * @date:  2021/2/26/9:52
     */
    Long selectOrderStatistics(@Param("year") Integer year, @Param("month") Integer month, @Param("day") Integer day);
}
