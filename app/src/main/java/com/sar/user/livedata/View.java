package com.sar.user.livedata;

import android.content.Intent;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class View extends ViewModel {

    MutableLiveData<Integer> a;
    public MutableLiveData<Integer> getNum()
    {
        if(a==null)
        {
            a=new MutableLiveData<>();
            a.setValue(0);
        }
        return a;

    }
    public  void addNumber()
    {
        if(a!=null)
        {
            a.setValue(a.getValue()+1);
        }
    }
}
