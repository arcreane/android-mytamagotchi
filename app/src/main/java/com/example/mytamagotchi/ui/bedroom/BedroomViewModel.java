package com.example.mytamagotchi.ui.bedroom;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mytamagotchi.Bedroom;
import com.example.mytamagotchi.Tamagochi;

public class BedroomViewModel extends ViewModel {

    private Tamagochi tamagochi;
    private MutableLiveData<String> mText;

    public BedroomViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is bedroom fragment");
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