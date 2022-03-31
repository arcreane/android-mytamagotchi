package com.example.mytamagotchi.ui.kitchen;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class KitchenViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public KitchenViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}