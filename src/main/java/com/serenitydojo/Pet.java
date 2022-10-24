package com.serenitydojo;

public class Pet {

    private String name;
    private String favoriteGame;
    private String favoriteToy;
    private int age;
    private String play;


    public Pet(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }


    public String getFavoriteGame(){
        return favoriteGame;
    }


   public String getFavoriteToy() {
        return favoriteToy;
    }

    public int getAge(){
        return age;
    }


    public String play(){
        return play;
    }


}
