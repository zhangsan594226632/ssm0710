package com.qf.dao;

import com.qf.bean.Knowledge;

import java.util.List;
import java.util.Map;

public interface KnowledgeDao {

    //1.查询书籍列表,map用来封装模糊查条件和分页数据
    public List<Knowledge> findknow(Map map);
    //3.添加书籍方法
    public int insertKnowledge(Knowledge knowledge);
    //4.主键查询
    public Knowledge findbyid(int kid);
    //5.修改
    public int updateKnowledge(Knowledge knowledge);
    //6.删除
    public int deleteknow(int kid);
}
