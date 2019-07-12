package com.qf.bean;

import java.util.Date;

/**
 * 2019/7/10
 * Administrator
 * ssm0710
 * 面向对象面向君  不负代码不负卿
 */
public class Knowledge {
    private int id;
    private String title;
    private Date lastmodified;
    private String content;
    private int classid;

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    private Classes classes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getLastmodified() {
        return lastmodified;
    }

    public void setLastmodified(Date lastmodified) {
        System.out.println(lastmodified);
        this.lastmodified = lastmodified;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }
}
