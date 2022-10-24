package com.serenitydojo;

public class Cat extends Pet {
    private String favoriteToy;


    public static final String CAT_GAME = "Play with String";

    public Cat(String name,String favoriteToy, int age) {
        super(name, age);
        this.favoriteToy = favoriteToy;

    }

    @Override
    public String getFavoriteToy(){
        return favoriteToy;
    }

    @Override
    public String play() {
        return "plays with string";
    }
}
