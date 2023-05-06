package com.example.demo.api.controller;


import com.example.demo.api.pojo.Article;
import com.example.demo.api.service.ArticleService;
import com.example.demo.common.Result;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author guosheng
 * @Version 1.0
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Resource
    private ArticleService articleService;

    /**
     * 获取物品列表
     */

    @PostMapping(value = "/getArticleList")
    public Result getArticleList(long pageIndex, long pageSize) {


        List<Article> records;
        try {

            records=articleService.getArticleList(pageIndex,pageSize);
            if (records.isEmpty() && records == null) {
                return Result.failure(Result.NO, "查询数据为空");
            }

        } catch (Exception e) {
            e.printStackTrace();
            return Result.failure(Result.ADD_FAIL, "查询异常");
        }

        return Result.success(Result.OK, "查询成功", records);

    }
}
