package com.ruoyi.system.controller;

import java.util.List;

import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.utils.ShiroUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.OrderDetails;
import com.ruoyi.system.service.IOrderDetailsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 订单详情Controller
 * 
 * @author ruoyi
 * @date 2021-02-19
 */
@Controller
@RequestMapping("/system/details")
public class OrderDetailsController extends BaseController
{
    private String prefix = "system/details";

    @Autowired
    private IOrderDetailsService orderDetailsService;

    @RequiresPermissions("system:details:view")
    @GetMapping()
    public String details()
    {
        return prefix + "/details";
    }

    /**
     * 查询订单详情列表
     */
    @RequiresPermissions("system:details:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(OrderDetails orderDetails)
    {
        startPage();
        List<OrderDetails> list = orderDetailsService.selectOrderDetailsList(orderDetails);
        return getDataTable(list);
    }

    /**
     * 导出订单详情列表
     */
    @RequiresPermissions("system:details:export")
    @Log(title = "订单详情", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(OrderDetails orderDetails)
    {
        List<OrderDetails> list = orderDetailsService.selectOrderDetailsList(orderDetails);
        ExcelUtil<OrderDetails> util = new ExcelUtil<OrderDetails>(OrderDetails.class);
        return util.exportExcel(list, "details");
    }

    /**
     * 新增订单详情
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存订单详情
     */
    @RequiresPermissions("system:details:add")
    @Log(title = "订单详情", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(OrderDetails orderDetails)
    {
        SysUser user = ShiroUtils.getSysUser();
        orderDetails.setCreateBy(user.getUserId().toString());
        orderDetails.setUpdateBy(user.getUserId().toString());
        return toAjax(orderDetailsService.insertOrderDetails(orderDetails));
    }

    /**
     * 修改订单详情
     */
    @GetMapping("/edit/{orderDetailsId}")
    public String edit(@PathVariable("orderDetailsId") Long orderDetailsId, ModelMap mmap)
    {
        OrderDetails orderDetails = orderDetailsService.selectOrderDetailsById(orderDetailsId);
        mmap.put("orderDetails", orderDetails);
        return prefix + "/edit";
    }

    /**
     * 修改保存订单详情
     */
    @RequiresPermissions("system:details:edit")
    @Log(title = "订单详情", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(OrderDetails orderDetails)
    {
        return toAjax(orderDetailsService.updateOrderDetails(orderDetails));
    }

    /**
     * 删除订单详情
     */
    @RequiresPermissions("system:details:remove")
    @Log(title = "订单详情", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(orderDetailsService.deleteOrderDetailsByIds(ids));
    }
}
