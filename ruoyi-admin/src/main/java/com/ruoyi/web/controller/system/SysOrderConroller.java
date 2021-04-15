package com.ruoyi.web.controller.system;/****************************************************
 * 创建人：     @author shiwei1    
 * 创建时间: 2021/4/14/17:41
 * 项目名称：  Ruoyi
 * 文件名称: null.java
 * 文件描述: @Description: (用一句话描述该文件做什么)
 *
 * All rights Reserved, Designed By 投资交易团队
 * @Copyright:2016-2021
 *
 ********************************************************/


import com.ruoyi.system.domain.Food;
import com.ruoyi.system.service.impl.FoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * 包名称：com.ruoyi.web.controller.system
 * 类名称：SysTestConroller
 * 类描述：
 * 创建人：@author shiwei1
 * 创建时间：2021/4/14/17:41
 */
@Controller
public class SysOrderConroller {

    private String prefix = "system/web";

    @Autowired
    private FoodServiceImpl foodService;

    /**
     *订餐主页
     *
     */
    @GetMapping("/orderIndex")
    public String orderIndex(Model model){
        List<Food> list = foodService.selectFoodList(null);
        model.addAttribute("foodList",list);
        return "orderIndex";
    }


    /**
     *订单
     *
     */
    @GetMapping("/myOrder")
    public String myOreder(){
        return prefix + "/Order";
    }


    /**
     *用户中心
     *
     */
    @GetMapping("/UserInfo")
    public String UserInfo(){
        return prefix + "/UserInfo";
    }


    /**
     *友情链接
     *
     */
    @GetMapping("/FriendLink")
    public String FriendLink(){
        return prefix + "/FriendLink";
    }
}
