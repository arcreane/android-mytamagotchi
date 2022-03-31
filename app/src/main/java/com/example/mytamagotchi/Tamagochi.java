package com.example.mytamagotchi;

public class Tamagochi {
    public String name;
    public String favoriteObject;
    public String favoriteFood;
    public String favoriteDrink;
    public Integer hunger;
    public Integer thirst;
    public Integer sleep;
    public Integer cleanliness;
    public Integer happiness;

    public Tamagochi(){}

    public Tamagochi(String myName, String myFavoriteFood, String myFavoriteDrink, String myFavoriteObject, Integer myHunger, Integer myThirst, Integer mySleep, Integer myCleanliness, Integer myHappiness){
        // Starters Data
        name = myName;
        favoriteFood = myFavoriteFood;
        favoriteDrink = myFavoriteDrink;
        favoriteObject = myFavoriteObject;
        hunger = myHunger;
        thirst = myThirst;
        sleep = mySleep;
        cleanliness = myCleanliness;
        happiness = myHappiness;
        // Define in which room the starter is playing based on what is needed for him
    }

}
