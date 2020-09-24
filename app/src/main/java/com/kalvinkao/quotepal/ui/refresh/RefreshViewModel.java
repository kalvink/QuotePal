package com.kalvinkao.quotepal.ui.refresh;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RefreshViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RefreshViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}