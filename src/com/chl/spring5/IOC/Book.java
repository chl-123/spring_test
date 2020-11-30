package com.chl.spring5.IOC;

public class Book {
    private String bname;
    private String bauthor;

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void print(){
        System.out.println(bname+bauthor);
    }
}
