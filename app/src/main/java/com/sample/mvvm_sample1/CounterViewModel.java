package com.sample.mvvm_sample1;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {
    private final MutableLiveData<Integer> countLiveData;
    private final Counter counter;

    public CounterViewModel() {
        counter = new Counter();
        countLiveData = new MutableLiveData<>();
        countLiveData.setValue(counter.getCount());
    }

    public LiveData<Integer> getCount() {
        return countLiveData;
    }

    public void increaseCount() {
        counter.increaseCount();
        countLiveData.setValue(counter.getCount());
    }
}

