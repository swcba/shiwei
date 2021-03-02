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
import com.ruoyi.system.domain.Finance;
import com.ruoyi.system.service.IFinanceService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 财政支出Controller
 * 
 * @author shiwei
 * @date 2021-02-23
 */
@Controller
@RequestMapping("/system/finance")
public class FinanceController extends BaseController
{
    private String prefix = "system/finance";

    @Autowired
    private IFinanceService financeService;

    @RequiresPermissions("system:finance:view")
    @GetMapping()
    public String finance()
    {
        return prefix + "/finance";
    }

    /**
     * 查询财政支出列表
     */
    @RequiresPermissions("system:finance:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Finance finance)
    {
        startPage();
        List<Finance> list = financeService.selectFinanceList(finance);
        return getDataTable(list);
    }

    /**
     * 导出财政支出列表
     */
    @RequiresPermissions("system:finance:export")
    @Log(title = "财政支出", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Finance finance)
    {

        List<Finance> list = financeService.selectFinanceList(finance);
        ExcelUtil<Finance> util = new ExcelUtil<Finance>(Finance.class);
        return util.exportExcel(list, "finance");
    }

    /**
     * 新增财政支出
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存财政支出
     */
    @RequiresPermissions("system:finance:add")
    @Log(title = "财政支出", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Finance finance)
    {
        SysUser user = ShiroUtils.getSysUser();
        finance.setCreateBy(user.getUserId().toString());
        finance.setUpdateBy(user.getUserId().toString());
        return toAjax(financeService.insertFinance(finance));
    }

    /**
     * 修改财政支出
     */
    @GetMapping("/edit/{financeId}")
    public String edit(@PathVariable("financeId") Long financeId, ModelMap mmap)
    {
        Finance finance = financeService.selectFinanceById(financeId);
        mmap.put("finance", finance);
        return prefix + "/edit";
    }

    /**
     * 修改保存财政支出
     */
    @RequiresPermissions("system:finance:edit")
    @Log(title = "财政支出", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Finance finance)
    {
        return toAjax(financeService.updateFinance(finance));
    }

    /**
     * 删除财政支出
     */
    @RequiresPermissions("system:finance:remove")
    @Log(title = "财政支出", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(financeService.deleteFinanceByIds(ids));
    }
}
