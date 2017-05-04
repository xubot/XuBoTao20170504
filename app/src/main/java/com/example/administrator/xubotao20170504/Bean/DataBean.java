package com.example.administrator.xubotao20170504.Bean;

/**
 * 用途：
 * 作者：xuBoTao
 * 时间：2017/5/4 10:09
 */

public class DataBean {
    private String title;
    private String img;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public DataBean(String title, String img) {

        this.title = title;
        this.img = img;
    }
}
