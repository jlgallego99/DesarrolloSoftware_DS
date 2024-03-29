package com.example.appcatalogo.ui.home;

import android.widget.TextView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Con esta app podrás consultar videojuegos, sus precios y enlaces hacia las distintas páginas para comprarlos");
    }

    public LiveData<String> getText() {
        return mText;
    }
}