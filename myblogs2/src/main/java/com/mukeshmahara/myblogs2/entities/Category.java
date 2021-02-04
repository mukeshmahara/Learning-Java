package com.mukeshmahara.myblogs2.entities;

public class Category {
    private int cid;
    private String name;
    private String description;
    private String image;

    //Constructors
    public Category() {
    }


    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Category(int cid, String name, String description) {
        this.cid = cid;
        this.name = name;
        this.description = description;
    }

    public Category(String name, String description, String image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public Category(int cid, String name, String description, String image) {
        this.cid = cid;
        this.name = name;
        this.description = description;
        this.image = image;
    }

//    Getters and Setters

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
