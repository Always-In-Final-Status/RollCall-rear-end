package com.alibaba.bean;

/**
 * 用户信息
 */
public class Teacher {
    private String tid;
    private String tnum;
    private String tpswd;
    private String tname;
    private String temail;
    private String tphone;
    public String getId() {
        return tid;
    }

    public void setId(String tid) {
        this.tid = tid;
    }

    public String getUsername() {
        return tnum;
    }

    public void setUsername(String tnum) {
        this.tnum = tnum;
    }

    public String getPassword() {
        return tpswd;
    }

    public void setPassword(String tpswd) {
        this.tpswd = tpswd;
    }
}
