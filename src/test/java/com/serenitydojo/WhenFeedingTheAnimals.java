package com.serenitydojo;

import com.serenitydojo.model.Feeder;
import com.serenitydojo.model.FoodType;
import org.junit.Assert;
import org.junit.Test;

import static com.serenitydojo.model.FoodType.*;


public class WhenFeedingTheAnimals {

    @Test
    public void shouldFeedCatsTuna() {
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds("Cat", TUNA,  false);

        Assert.assertEquals(TUNA, food);
    }

    @Test
    public void shouldFeedHamstersCabbage() {
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds("Hamster",CABBAGE, false);

        Assert.assertEquals(CABBAGE, food);
    }

    @Test
    public void shouldFeedDogsDogFood() {
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds("DOG",DOG_FOOD, false);

        Assert.assertEquals(DOG_FOOD, food);
    }

    @Test
    public void shouldFeedPremiumCatsPremiumFood() {
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds("Cat",SALMON, true);

        Assert.assertEquals(SALMON, food);

    }
@Test
    public void dog_play(){
        Dog fido = new Dog("Fido", "Bone", 5);
        String dogGame = "";
        dogGame = fido.play();

    }

    @Test
    public void cat_play() {
        Cat kitty = new Cat("Kitty", "String", 4);
        String catGame = "";
        catGame = kitty.play();
    }

    @Test
    public void hamster_play() {
        Hamster hazel = new Hamster("Hazel", "Wheel", 1);
        String hamsterGame = "";
        hamsterGame = hazel.play();
    }
}
