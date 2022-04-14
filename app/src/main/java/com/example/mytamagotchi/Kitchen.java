package com.example.mytamagotchi;

public class Kitchen extends Room {


    public void feedPet(Tamagochi tamagochi){
        tamagochi.hunger += 2;
        tamagochi.thirst += 2;
    }
}
