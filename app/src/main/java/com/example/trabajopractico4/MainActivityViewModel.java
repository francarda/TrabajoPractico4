package com.example.trabajopractico4;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class MainActivityViewModel extends AndroidViewModel {
    private Context context;
    private MutableLiveData<String> mensaje;
    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        context= application.getApplicationContext();
    }
    public LiveData<String> getMensaje(){
        if (mensaje==null){
            mensaje= new MutableLiveData<>();
        }
        return mensaje;
    }

}
