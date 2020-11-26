package com.chl.spring5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Students {
    private String [] courses;
    private List<String> list;
    private Map<String,String> map;
    private List<Course> list2;
    private List<String> utillist;


    public void setUtillist(List<String> utillist) {
        this.utillist = utillist;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setList2(List<Course> list2) {
        this.list2 = list2;
    }


    public  void print(){

        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(map);
        System.out.println(list2);
        System.out.println(utillist);
    }
}
