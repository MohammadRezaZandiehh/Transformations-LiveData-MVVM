package com.example.transformationslivedatamvvm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private MutableLiveData<User> userMutableLiveData = new MutableLiveData<>();
    public LiveData<String> fullNameLiveData = Transformations.map(userMutableLiveData, user ->user.getFirstName() + " " + user.getLastName() + "");


    public MainViewModel (){
        userMutableLiveData.setValue(new User("jamshid", "zandieh"));
    }
}
