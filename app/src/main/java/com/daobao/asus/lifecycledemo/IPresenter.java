package com.daobao.asus.lifecycledemo;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.support.annotation.NonNull;

/**
 * LifecycleObserver；生命周期的观察者
 * lifecylcle中只监听六个方法创建，销毁，暂停，开始，重新开始，每次循环
 *
 *
 */
public interface IPresenter extends LifecycleObserver {

    //event:当前生命周期改变的状态 status 当前生命周期状态
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    default void OnCreate(@NonNull LifecycleOwner owner){}

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    default void OnDestroy(@NonNull LifecycleOwner owner){}

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    default void OnPause(@NonNull LifecycleOwner owner){}

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    default void OnResume(@NonNull LifecycleOwner owner){}

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    default void OnStart(@NonNull LifecycleOwner owner){}

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    default void OnStop(@NonNull LifecycleOwner owner){}

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    default void OnLifeCycleChanged(@NonNull LifecycleOwner owner){}
}
