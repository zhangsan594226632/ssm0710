package com.qf.bean;

import javax.xml.crypto.dsig.keyinfo.KeyName;
import java.sql.Timestamp;
import java.util.List;

/**
 * 2019/7/10
 * Administrator
 * ssm0710
 * 面向对象面向君  不负代码不负卿
 */
public class Classes {

    private int id;
    private String cname;

    private List<Knowledge> knowledgeList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<Knowledge> getKnowledgeList() {
        return knowledgeList;
    }

    public void setKnowledgeList(List<Knowledge> knowledgeList) {
        this.knowledgeList = knowledgeList;
    }
}
