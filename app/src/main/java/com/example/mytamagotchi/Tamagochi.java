package com.example.mytamagotchi;

import android.util.Log;
import android.view.View;

import androidx.fragment.app.FragmentManager;
import androidx.navigation.fragment.NavHostFragment;

import com.example.mytamagotchi.databinding.FragmentStartroomBinding;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

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

    public Tamagochi(){
        this.CreateStatTamagochi("Enzo", "Frites", "Coca", "Ballon", 0, 0, 0, 0);
        this.loseRessources();
    }

    public void CreateStatTamagochi(String myName, String myFavoriteFood, String myFavoriteDrink, String myFavoriteObject, Integer myHunger, Integer myThirst, Integer mySleep, Integer myCleanliness){
        // Starters Data
        name = myName;
        favoriteFood = myFavoriteFood;
        favoriteDrink = myFavoriteDrink;
        favoriteObject = myFavoriteObject;
        hunger = myHunger;
        thirst = myThirst;
        sleep = mySleep;
        cleanliness = myCleanliness;
        happiness = (hunger+thirst+sleep+cleanliness)/4;
        // Define in which room the starter is playing based on what is needed for him
    }

    public void loseRessources () {

        new Timer().scheduleAtFixedRate(new TimerTask(){
            @Override
            public void run(){
                int random = new Random().nextInt(4);
                String listOfStat[] = {"hunger", "thrist", "sleep", "cleanliness"};
                switch (listOfStat[random]) {
                    case "hunger":
                        if (hunger == 0){
                            Log.i("tag", "Game over");
//                            View view = null;
//                            view.findViewById(R.id.navigation_start);
//                            FragmentManager.findFragment(view);
                            break;
                            /// Swap to game over screen
                        }
                        hunger--;
                        Log.i("tag", "hunger"+ hunger);

                        break;
                    case "thrist":
                        if (thirst == 0){
                            Log.i("tag", "Game over");
//                            View view = null;
//                            view.findViewById(R.id.navigation_start);
//                            FragmentManager.findFragment(view);
                            break;
                            /// Swap to game over screen
                        }
                        thirst--;
                        Log.i("tag", "thrist"+thirst);

                        break;
                    case "sleep":
                        if (sleep == 0){
                            Log.i("tag", "Game over");
//                            View view = null;
//                            view.findViewById(R.id.navigation_start);
//                            FragmentManager.findFragment(view);
                            break;
                            /// Swap to game over screen
                        }
                        sleep--;
                        Log.i("tag", "sleep" + sleep);

                        break;
                    case "cleanliness":
                        if (cleanliness == 0){
                            Log.i("tag", "Game over");
//                            View view = null;
//                            view.findViewById(R.id.navigation_start);
//                            FragmentManager.findFragment(view);
                            break;
                            /// Swap to game over screen
                        }
                        cleanliness--;
                        Log.i("tag", "cleanliness" + cleanliness);

                        break;

                }
                happiness = (hunger+thirst+sleep+cleanliness)/4;
                Log.i("tag", "Loses");
                Log.i("tag", String.valueOf(happiness));
            }
        },0,10000);
    }

}
