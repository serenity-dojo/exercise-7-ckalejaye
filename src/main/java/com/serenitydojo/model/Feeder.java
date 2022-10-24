package com.serenitydojo.model;

public class Feeder {
    public FoodType feeds(String animal, FoodType food, boolean isPremium) {

        switch (food) {
            case TUNA:
                return FoodType.TUNA;
            case SALMON:
                return FoodType.SALMON;
            case CABBAGE:
                return FoodType.CABBAGE;
            case LETTUCE:
                return FoodType.LETTUCE;
            case DOG_FOOD:
                return FoodType.DOG_FOOD;
            case DELUXE_DOG_FOOD:
                return FoodType.DELUXE_DOG_FOOD;
            default:
                return FoodType.UNKNOWN;



        }

    }
}
