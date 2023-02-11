package com.example.coderzcalculator;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    public MutableLiveData<String> entryText = new MutableLiveData<>();
    private StringBuilder builder = new StringBuilder();

    public void addCharacter(int character){
        if(character==0 && builder.length()==0) return;
        builder.append(character);
        entryText.postValue(builder.toString());
    }

    public void addDecimal(){
        if (builder.indexOf(".") > 0) return;
        if (builder.length()==0) {
            builder.append("0.");
            entryText.postValue(builder.toString());
            return;
        }
        builder.append(".");
        entryText.postValue(builder.toString());
    }

    public void clearEntry(){
        builder = new StringBuilder();
        entryText.postValue("0.");
    }

    public void deleteLastCharacter(){
        if (builder.length()==0){
            entryText.postValue("0.");
            return;
        }
        builder.deleteCharAt(builder.length()-1);
        if(builder.length()==0) {
            entryText.postValue("0.");
            return;
        }
        entryText.postValue(builder.toString());
    }
}
