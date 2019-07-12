package com.qf.service;

import com.github.pagehelper.PageInfo;
import com.qf.bean.Classes;
import com.qf.bean.Knowledge;

import java.util.List;
import java.util.Map;

/**
 * 2019/7/10
 * Administrator
 * ssm0710
 * 面向对象面向君  不负代码不负卿
 */
public interface KnowledgeService {

    //1.查询书籍列表,map用来封装模糊查条件和分页数据
    public PageInfo<Knowledge> findknow(String title, int index, int size);
    //2.查询分类列表
    public List<Classes> findclasses();
    //3.添加书籍方法
    public int insertKnowledge(Knowledge knowledge);
    //4.主键查询
    public Knowledge findbyid(int kid);
    //5.修改
    public int updateKnowledge(Knowledge knowledge);
    //6.删除
    public int deleteknow(int kid);


}
