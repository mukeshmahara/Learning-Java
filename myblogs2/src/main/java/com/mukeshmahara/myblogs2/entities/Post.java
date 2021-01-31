package com.mukeshmahara.myblogs2.entities;

import java.sql.Timestamp;

public class Post {
    private int pid;
    private String ptitle;
    private String pcontent;
    private String pic;
    private Timestamp created_at;
    private int cid;
    private  int uid;

    //    Constructors

    public Post() {
    }

    public Post(String ptitle, String pcontent, String pic, Timestamp created_at, int cid ,int uid) {
        this.ptitle = ptitle;
        this.pcontent = pcontent;
        this.pic = pic;
        this.created_at = created_at;
        this.cid = cid;
        this.uid =uid;
    }

    public Post(int pid, String ptitle, String pcontent, String pic, Timestamp created_at, int cid) {
        this.pid = pid;
        this.ptitle = ptitle;
        this.pcontent = pcontent;
        this.pic = pic;
        this.created_at = created_at;
        this.cid = cid;
        this.uid =uid;
    }

    public Post(int pid, String ptitle, String pcontent, String pPic, Timestamp created_at, int cid, int uid) {
    this.uid=uid;
    this.pid=pid;
    this.cid=cid;
    this.ptitle= ptitle;
    this.pcontent = pcontent;
    this.pic = pPic;

    }


//Getters and Setters


    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPtitle() {
        return ptitle;
    }

    public void setPtitle(String ptitle) {
        this.ptitle = ptitle;
    }

    public String getPcontent() {
        return pcontent;
    }

    public void setPcontent(String pcontent) {
        this.pcontent = pcontent;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}

