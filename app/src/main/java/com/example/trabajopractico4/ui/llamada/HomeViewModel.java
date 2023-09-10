package com.example.trabajopractico4.ui.llamada;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends AndroidViewModel {
    private Context context;
    private MutableLiveData<String> mensajeError;
    public HomeViewModel(@NonNull Application application) {
        super(application);
        context= application.getApplicationContext();
    }

    public void llamar(String numero){
        if(numero.equals("")){
            mensajeError.setValue("Debe ingrear un numero");
        }else{
        Intent intent= new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel: " + numero));
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }}
    public LiveData<String> getMensajeError(){
        if(mensajeError==null){
            mensajeError= new MutableLiveData<>();
        }
        return mensajeError;
    }


}