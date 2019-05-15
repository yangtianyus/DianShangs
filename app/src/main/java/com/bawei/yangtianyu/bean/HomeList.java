package com.bawei.yangtianyu.bean;

import java.util.List;


public class HomeList {

    public Result result;
    public String message;


    public static class Result {
        public Item rxxp;

    }

    public static class Item {
        public List<Commodity> commodityList;
        public int id;
        public String name;
    }

    public static class Commodity {
         public String commodityName;
        public String masterPic;
        public int price;
     }
}
