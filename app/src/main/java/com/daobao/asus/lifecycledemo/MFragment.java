package com.daobao.asus.lifecycledemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 注意：在fragment和activity 中都自带的getLifecycle（），得需要实现接口LifecycleObserver
 * 其他并且得加上注解 @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
 * 然后可以监听每个view中的生命周期
 *
 * Lifecycle
 * 源码分析主要有三个方法
 * 1.注册观察者  addObserver（）
 * 2.移除观察者 removeObserver()
 * 3.获取当前的状态 getCurrentState（）
 * 在lifecycleRegistry()中的方法handleLifecycleEvent（）通过getStateAfter（）获取state值修改Lifecycle中的值，并且然后修改遍历LiecycleObserver，
 * 并且通知来监听生命周期的改变
 */
public class MFragment extends Fragment {
    private IPresenter mPresenter;
    private View mRootView;
    private MTextView mTextView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(mRootView==null){
            mRootView = inflater.inflate(R.layout.fragment_test,container,false);
            mPresenter = new PresenterImpl("MFragment");
            //创建初始化服务器的监听者p层
            getLifecycle().addObserver(mPresenter);
            mTextView = mRootView.findViewById(R.id.textView);
            //具体监听某个view的生命周期感知（具体方法）
            mTextView.setLifecycle(getLifecycle());
        }
        return mRootView;
    }
}
