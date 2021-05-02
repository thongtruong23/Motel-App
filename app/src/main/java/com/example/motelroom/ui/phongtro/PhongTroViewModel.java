package com.example.motelroom.ui.phongtro;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PhongTroViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PhongTroViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is phong tro fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}