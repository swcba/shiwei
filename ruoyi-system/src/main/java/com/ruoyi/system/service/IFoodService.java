package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Food;

/**
 * 菜单Service接口
 * 
 * @author ruoyi
 * @date 2021-04-15
 */
public interface IFoodService 
{
    /**
     * 查询菜单
     * 
     * @param foodId 菜单ID
     * @return 菜单
     */
    public Food selectFoodById(Long foodId);

    /**
     * 查询菜单列表
     * 
     * @param food 菜单
     * @return 菜单集合
     */
    public List<Food> selectFoodList(Food food);

    /**
     * 新增菜单
     * 
     * @param food 菜单
     * @return 结果
     */
    public int insertFood(Food food);

    /**
     * 修改菜单
     * 
     * @param food 菜单
     * @return 结果
     */
    public int updateFood(Food food);

    /**
     * 批量删除菜单
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFoodByIds(String ids);

    /**
     * 删除菜单信息
     * 
     * @param foodId 菜单ID
     * @return 结果
     */
    public int deleteFoodById(Long foodId);
}
