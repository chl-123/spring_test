package com.chl.spring5.IOC;

public class Orders {
    private String name;
    private String address;

    public Orders(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public void  print(){
        System.out.println(name+address);
    }
}
