package com.example.demo.api.service;

import com.example.demo.api.pojo.Article;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author sheng
* @description 针对表【article】的数据库操作Service
* @createDate 2023-05-06 15:39:35
*/
public interface ArticleService extends IService<Article> {

    List<Article> getArticleList(long pageIndex, long pageSize);
}
