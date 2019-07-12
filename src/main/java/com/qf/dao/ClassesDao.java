package com.qf.dao;

import com.qf.bean.Classes;

import java.util.List;

public interface ClassesDao {
    //2.查询分类列表
    public List<Classes> findclasses();
}
