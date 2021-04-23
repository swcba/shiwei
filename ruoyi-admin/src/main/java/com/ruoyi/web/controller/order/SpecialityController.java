package com.ruoyi.web.controller.order;/****************************************************
 * 创建人：     @author shiwei1    
 * 创建时间: 2021/4/15/11:18
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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


/**
 * 包名称：com.ruoyi.web.controller.order
 * 类名称：SpecialityController
 * 类描述：
 * 创建人：@author shiwei1
 * 创建时间：2021/4/15/11:18
 */
@Controller
public class SpecialityController {

    @Autowired
    private FoodServiceImpl foodService;

    @PostMapping("/foodInfo")
    @ResponseBody
    private String speciality(@RequestParam String foodId) {
        return "/system/web/FoodInfo";
    }

    @GetMapping("/speciality")
    private String foodType(@RequestParam String foodType, Model model) {

        List<Food> list = new ArrayList<>();

        Food food = foodService.selectFoodById(Long.valueOf(foodType));

        list.add(food);

        model.addAttribute(list);

        return "orderIndex";
    }

    @GetMapping("/system/web/FoodInfo")
    private String foodInfo() {
        return "/system/web/FoodInfo";
    }

}
