package com.hr.entity;

public class Book {
    private Integer bid;

    private String bname;

    private Integer aid;

    private Author author;

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", aid=" + aid +
                ", author=" + author +
                '}';
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname == null ? null : bname.trim();
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }
}