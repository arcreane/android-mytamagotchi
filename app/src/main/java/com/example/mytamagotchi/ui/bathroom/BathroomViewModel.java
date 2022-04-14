package com.example.mytamagotchi.ui.bathroom;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.mytamagotchi.Bathroom;
import com.example.mytamagotchi.Tamagochi;

public class BathroomViewModel extends ViewModel {


    public Tamagochi getTamagochi() {
        return tamagochi;
    }

    public void setTamagochi(Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
    }

    private Tamagochi tamagochi;

    private MutableLiveData<String> mText;

    public BathroomViewModel() {
        Bathroom bathroom = new Bathroom();
        mText = new MutableLiveData<>();
        bathroom.washPet(tamagochi);
        mText.setValue("Bathroom");
    }

    public LiveData<String> getText() {
        return mText;
    }
}