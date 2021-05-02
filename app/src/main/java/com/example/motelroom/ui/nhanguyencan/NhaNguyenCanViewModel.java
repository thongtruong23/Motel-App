package com.example.motelroom.ui.nhanguyencan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NhaNguyenCanViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NhaNguyenCanViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}