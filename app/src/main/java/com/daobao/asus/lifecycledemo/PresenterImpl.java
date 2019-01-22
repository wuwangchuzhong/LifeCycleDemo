package com.daobao.asus.lifecycledemo;

import android.arch.lifecycle.LifecycleOwner;
import android.support.annotation.NonNull;
import android.util.Log;

/**
 * Created by db on 2018/9/17.
 */
public class PresenterImpl implements IPresenter {

    private String TAG = "Test";
    private String Name;

    public PresenterImpl(String name){
        this.Name = name;
    }

    @Override
    public void OnCreate(@NonNull LifecycleOwner owner) {
        Log.d(TAG,Name+":OnCreate");
    }

    @Override
    public void OnDestroy(@NonNull LifecycleOwner owner) {
        Log.d(TAG,Name+":OnDestroy");
    }

    @Override
    public void OnPause(@NonNull LifecycleOwner owner) {
        Log.d(TAG,Name+":OnPause");
    }

    @Override
    public void OnResume(@NonNull LifecycleOwner owner) {
        Log.d(TAG,Name+":OnResume");
    }

    @Override
    public void OnStart(@NonNull LifecycleOwner owner) {
        Log.d(TAG,Name+":OnStart");
    }

    @Override
    public void OnStop(@NonNull LifecycleOwner owner) {
        Log.d(TAG,Name+":OnStop");
    }

    @Override
    public void OnLifeCycleChanged(@NonNull LifecycleOwner owner) {
        Log.d(TAG,Name+":OnLifeCycleChanged");
    }
}
