package com.example.mytamagotchi.ui.kitchen;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mytamagotchi.Kitchen;
import com.example.mytamagotchi.Tamagochi;

public class KitchenViewModel extends ViewModel {

    private Tamagochi tamagochi;
    private MutableLiveData<String> mText;

    public KitchenViewModel() {
        Kitchen kitchen = new Kitchen();
        kitchen.feedPet(tamagochi);
        mText = new MutableLiveData<>();
        mText.setValue("This is kitchen fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

    public Tamagochi getTamagochi() {
        return tamagochi;
    }

    public void setTamagochi(Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
    }
}