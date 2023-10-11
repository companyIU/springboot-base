package com.example.springbootbase.controller;

import cn.hutool.core.thread.ExecutorBuilder;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.example.springbootbase.pojo.UserParam;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Min;
import java.util.StringJoiner;

/**
 * @author weibing
 * @since 2023-10-06 15:44
 */
@RestController
@Validated
public class IndexController {

    @GetMapping("/index")
    public String index(@Validated UserParam userParam) {
        System.out.println(userParam);
        return "index";
    }

    @GetMapping("/index1")
    public String index1(@Min(2) Integer num) {
        System.out.println(num);
        return "index";
    }

    public static void main(String[] args) {
        String jsonStr = JSONUtil.toJsonStr(22);
        System.out.println(jsonStr);
        
    }
}
