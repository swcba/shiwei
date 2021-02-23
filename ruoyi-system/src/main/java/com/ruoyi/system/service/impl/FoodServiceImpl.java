package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.FoodMapper;
import com.ruoyi.system.domain.Food;
import com.ruoyi.system.service.IFoodService;
import com.ruoyi.common.core.text.Convert;

/**
 * 菜单Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-02-19
 */
@Service
public class FoodServiceImpl implements IFoodService 
{
    @Autowired
    private FoodMapper foodMapper;

    /**
     * 查询菜单
     * 
     * @param foodId 菜单ID
     * @return 菜单
     */
    @Override
    public Food selectFoodById(Long foodId)
    {
        return foodMapper.selectFoodById(foodId);
    }

    /**
     * 查询菜单列表
     * 
     * @param food 菜单
     * @return 菜单
     */
    @Override
    public List<Food> selectFoodList(Food food)
    {
        return foodMapper.selectFoodList(food);
    }

    /**
     * 新增菜单
     * 
     * @param food 菜单
     * @return 结果
     */
    @Override
    public int insertFood(Food food)
    {
        food.setCreateTime(DateUtils.getNowDate());
        food.setUpdateTime(DateUtils.getNowDate());
        return foodMapper.insertFood(food);
    }

    /**
     * 修改菜单
     * 
     * @param food 菜单
     * @return 结果
     */
    @Override
    public int updateFood(Food food)
    {
        food.setUpdateTime(DateUtils.getNowDate());
        return foodMapper.updateFood(food);
    }

    /**
     * 删除菜单对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFoodByIds(String ids)
    {
        return foodMapper.deleteFoodByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除菜单信息
     * 
     * @param foodId 菜单ID
     * @return 结果
     */
    @Override
    public int deleteFoodById(Long foodId)
    {
        return foodMapper.deleteFoodById(foodId);
    }
}
