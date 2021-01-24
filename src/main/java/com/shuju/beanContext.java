package com.shuju;

public class beanContext {
    private String title;
    private String price;
    private String im;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getIm() {
        return this.im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public beanContext(String title, String price, String im) {
        this.title = title;
        this.price = price;
        this.im = im;
    }

    public String toString() {
        return "beanContext{title='" + this.title + '\'' + ", price='" + this.price + '\'' + ", im='" + this.im + '\'' + '}';
    }

    public beanContext() {
    }
}
