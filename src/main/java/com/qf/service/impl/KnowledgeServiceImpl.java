package com.qf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.bean.Classes;
import com.qf.bean.Knowledge;
import com.qf.dao.ClassesDao;
import com.qf.dao.KnowledgeDao;
import com.qf.service.KnowledgeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2019/7/10
 * Administrator
 * ssm0710
 * 面向对象面向君  不负代码不负卿
 */
@Service
public class KnowledgeServiceImpl implements KnowledgeService {

    @Resource
    private ClassesDao classesDao;
    @Resource
    private KnowledgeDao knowledgeDao;

    @Override
    public PageInfo<Knowledge> findknow(String title, int index, int size){
        PageHelper.startPage(index,size);
        Map map=new HashMap();
        map.put("title",title);
        List<Knowledge> knowledgeList = knowledgeDao.findknow(map);
        return new PageInfo<Knowledge>(knowledgeList);
    }

    @Override
    public List<Classes> findclasses() {
        return classesDao.findclasses();
    }

    @Override
    @Transactional
    public int insertKnowledge(Knowledge knowledge) {
        return knowledgeDao.insertKnowledge(knowledge);
    }

    @Override
    public Knowledge findbyid(int kid) {
        return knowledgeDao.findbyid(kid);
    }

    @Override
    @Transactional
    public int updateKnowledge(Knowledge knowledge) {
        return knowledgeDao.updateKnowledge(knowledge);
    }

    @Override
    @Transactional
    public int deleteknow(int kid) {
        return knowledgeDao.deleteknow(kid);
    }
}
