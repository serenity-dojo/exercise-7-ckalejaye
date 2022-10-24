package com.serenitydojo;

public class Hamster extends Pet {

    private String favoriteGame;


    public Hamster(String name, String favoriteGame, int age) {
        super(name, age);
        this.favoriteGame = favoriteGame;

    }
    @Override
    public String getFavoriteGame(){
        return favoriteGame;
    }

@Override
    public String play(){
        return "runs in wheel";
    }
}
