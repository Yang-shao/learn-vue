package com.dayi.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 天气信息控制器
 * @author yangshaoqiang <yangshq@pvc123.com>
 * @create 2021-04-04 23:53
 */
@RestController
@RequestMapping("/weather")
public class WeatherController {

    /**
     * 查找城市对应的天气信息
     * @param name 城市名称
     * @return
     */
    @GetMapping("/find")
    @CrossOrigin
    public Map<String, String> findWeatherByCity(String name) {
        Map<String, String> map = new HashMap<>(1);
        String weather = this.getWeathers(name);
        map.put("message", weather);
        return map;
    }

    /**
     * 获取城市天气情况信息
     * @param name
     * @return
     */
    public String getWeathers(String name) {
        Map<String, String> weathers = new HashMap<>();
        weathers.put("北京", "晴转多云，空气清新！");
        weathers.put("上海", "多云转晴，空气质量不错！");
        weathers.put("深圳", "中到暴雨，空气也很好！");
        weathers.put("广州", "局部地区大风，空气也算不错！");
        weathers.put("天津", "里北京较近，和北京差不多！");
        return weathers.get(name);
    }

}
