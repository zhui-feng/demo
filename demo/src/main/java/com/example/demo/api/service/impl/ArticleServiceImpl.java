package com.example.demo.api.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.api.pojo.Article;
import com.example.demo.api.service.ArticleService;
import com.example.demo.api.mapper.ArticleMapper;
import com.example.demo.common.Result;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author sheng
* @description 针对表【article】的数据库操作Service实现
* @createDate 2023-05-06 15:39:35
*/
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article>
    implements ArticleService{


    @Resource
    private  ArticleMapper articleMapper;

    @Override
    public List<Article> getArticleList(long pageIndex, long pageSize) {
        Page<Article> page = new Page<>(pageIndex, pageSize);
        QueryWrapper<Article> wapper = new QueryWrapper();

        IPage<Article> userIPage = articleMapper.selectPage(page, wapper);

        return userIPage.getRecords();

    }
}




