package com.ruoyi.system.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.ShiroUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.Food;
import com.ruoyi.system.service.IFoodService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 菜单Controller
 * 
 * @author shiwei
 * @date 2021-02-19
 */
@Controller
@RequestMapping("/system/food")
public class FoodController extends BaseController
{
    private String prefix = "system/food";

    @Autowired
    private IFoodService foodService;

    @RequiresPermissions("system:food:view")
    @GetMapping()
    public String food()
    {
        return prefix + "/food";
    }

    /**
     * 查询菜单列表
     */
    @RequiresPermissions("system:food:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Food food)
    {
        startPage();
        List<Food> list = foodService.selectFoodList(food);
        return getDataTable(list);
    }

    /**
     * 导出菜单列表
     */
    @RequiresPermissions("system:food:export")
    @Log(title = "菜单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Food food)
    {
        List<Food> list = foodService.selectFoodList(food);
        ExcelUtil<Food> util = new ExcelUtil<Food>(Food.class);
        return util.exportExcel(list, "food");
    }

    /**
     * 新增菜单
     */
    @GetMapping("/add")
    public String add()
    {

        return prefix + "/add";
    }

    /**
     * 新增保存菜单
     */
    @RequiresPermissions("system:food:add")
    @Log(title = "菜单", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Food food)
    {
        SysUser user = ShiroUtils.getSysUser();
        food.setCreateBy(user.getUserId().toString());
        food.setUpdateBy(user.getUserId().toString());
        return toAjax(foodService.insertFood(food));
    }

    /**
     * 修改菜单
     */
    @GetMapping("/edit/{foodId}")
    public String edit(@PathVariable("foodId") Long foodId, ModelMap mmap)
    {
        Food food = foodService.selectFoodById(foodId);
        mmap.put("food", food);
        return prefix + "/edit";
    }

    /**
     * 修改保存菜单
     */
    @RequiresPermissions("system:food:edit")
    @Log(title = "菜单", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Food food)
    {
        return toAjax(foodService.updateFood(food));
    }

    /**
     * 删除菜单
     */
    @RequiresPermissions("system:food:remove")
    @Log(title = "菜单", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(foodService.deleteFoodByIds(ids));
    }
}
