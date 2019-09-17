package com.hr.entity;

import java.util.List;

public class Author {
    private Integer aid;

    private String aname;

    private List<Book> blist;

    @Override
    public String toString() {
        return "Author{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", blist=" + blist +
                '}';
    }

    public List<Book> getBlist() {
        return blist;
    }

    public void setBlist(List<Book> blist) {
        this.blist = blist;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }
}