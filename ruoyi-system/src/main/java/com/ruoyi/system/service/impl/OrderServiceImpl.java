package com.ruoyi.system.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.DateBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.OrderMapper;
import com.ruoyi.system.domain.Order;
import com.ruoyi.system.service.IOrderService;
import com.ruoyi.common.core.text.Convert;

/**
 * 订单Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-02-19
 */
@Service
public class OrderServiceImpl implements IOrderService 
{
    @Autowired
    private OrderMapper orderMapper;

    /**
     * 查询订单
     * 
     * @param orderId 订单ID
     * @return 订单
     */
    @Override
    public Order selectOrderById(Long orderId)
    {
        return orderMapper.selectOrderById(orderId);
    }

    /**
     * 查询订单列表
     * 
     * @param order 订单
     * @return 订单
     */
    @Override
    public List<Order> selectOrderList(Order order)
    {
        return orderMapper.selectOrderList(order);
    }

    /**
     * 新增订单
     * 
     * @param order 订单
     * @return 结果
     */
    @Override
    public int insertOrder(Order order)
    {
        order.setCreateTime(DateUtils.getNowDate());
        order.setUpdateTime(DateUtils.getNowDate());
        return orderMapper.insertOrder(order);
    }

    /**
     * 修改订单
     * 
     * @param order 订单
     * @return 结果
     */
    @Override
    public int updateOrder(Order order)
    {
        order.setUpdateTime(DateUtils.getNowDate());
        return orderMapper.updateOrder(order);
    }

    /**
     * 删除订单对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteOrderByIds(String ids)
    {
        return orderMapper.deleteOrderByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除订单信息
     * 
     * @param orderId 订单ID
     * @return 结果
     */
    @Override
    public int deleteOrderById(Long orderId)
    {
        return orderMapper.deleteOrderById(orderId);
    }

    /**
     *查询订单数目
     *
     * @return: java.lang.Long
     * @author: shiwei1
     * @date:  2021/2/25/10:58
     */
    @Override
    public Long selectOrderNum(Integer flag) {

        if (flag != null) {
            DateBean dateBean = getData(flag);
            return orderMapper.selectOrderNum(flag,dateBean.getYear());
        }
        return orderMapper.selectOrderNum(null,null);
    }

    /**
     *根据年月日查询订单信息
     *
     * @return: java.util.List<com.ruoyi.system.domain.Order>
     * @author: shiwei1
     * @date:  2021/2/26/9:52
     */
    @Override
    public Long selectOrderStatistics(Integer flag) {

        if (flag != null) {
            DateBean dateBean = getData(flag);
            return orderMapper.selectOrderStatistics(dateBean.getYear(),dateBean.getMonth(),dateBean.getDay());
        }
        return orderMapper.selectOrderStatistics(null,null,null);
    }


    public DateBean getData(Integer flag){

        DateBean dateBean = new DateBean();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        switch (flag){
            case 0:
                dateBean.setYear(calendar.get(Calendar.YEAR));
                dateBean.setMonth(calendar.get(Calendar.MONTH)+1);
                dateBean.setDay(calendar.get(Calendar.DAY_OF_MONTH));
            case 1:
                dateBean.setYear(calendar.get(Calendar.YEAR));
                dateBean.setMonth(calendar.get(Calendar.MONTH)+1);
            case 2:
                dateBean.setYear(calendar.get(Calendar.YEAR));

        }
        return dateBean;
    }
}
