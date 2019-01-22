package com.daobao.asus.lifecycledemo;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.util.Log;


/**
 * lifecycles:(生命周期感知组件，这个方法就是处理生命周期相关的操作)
 * 利用textview 按钮来监控控件生命周期
 * textview实现了接口的所有方法（p层跟lifecycle生命周期绑定在一起）
 * addObserver；生命周期持有者接口
 * LifecycleObserver：生命周期观察者接口
 */
public class MTextView extends AppCompatTextView implements IPresenter {
    
    private String TAG = "Test";

    public MTextView(Context context) {
        this(context,null);
    }

    public MTextView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    //创建初始化 addObserver 监听保证生命周期利用text
    public void setLifecycle(Lifecycle lifecycle){
        lifecycle.addObserver(this);
    }

    @Override
    public void OnCreate(@NonNull LifecycleOwner owner) {
        Log.e("lifecycle","OnCreate");
    }

    @Override
    public void OnStart(@NonNull LifecycleOwner owner) {
        Log.e("lifecycle","OnStart");
    }

    @Override
    public void OnResume(@NonNull LifecycleOwner owner) {
        Log.e("lifecycle","OnResume");
    }

    @Override
    public void OnPause(@NonNull LifecycleOwner owner) {
        Log.e("lifecycle","OnPause");
    }

    @Override
    public void OnStop(@NonNull LifecycleOwner owner) {
        Log.e("lifecycle","OnStop");
    }

    @Override
    public void OnDestroy(@NonNull LifecycleOwner owner) {
        Log.e("lifecycle","OnDestroy");
    }

    private int i=0;

    @Override
    public void OnLifeCycleChanged(@NonNull LifecycleOwner owner) {
        i++;
        Log.e("lifecycle","OnLifeCycleChanged"+i);
    }

}
