package com.guoliang.springboot.model;

import java.lang.reflect.Type;

public class Dash {
    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final  Type type;


    public Dash(String name, boolean vegetarian, int calories, Type type){
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;

    }

    public enum Type  {
        MEAT,FISH,OTHER
    }


    @Override
    public  String toString(){
        return name;
    }
    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }
}
