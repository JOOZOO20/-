package com.company;

public class Item {
    String top;
    String bottom;
    String shoe;
    String color;
    String name;
    String price;
    String ap;

    public Item(String top, String bottom, String shoe, String color){
        this.top=top;
        this.bottom=bottom;
        this.shoe=shoe;
        this.color=color;
    }

    public Item(String name, String ap, String price){
        this.name=name;
        this.ap = ap;
        this.price = price;
    }

    Weapon w = new Weapon();

}
