package com.jayphone.arch.mvp;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

import com.jayphone.arch.integration.*;

/**
 * Created by JayPhone on 2019/12/22
 * Model基类
 */
public class BaseModel implements IModel, LifecycleObserver {
    protected IRepositoryManager mIRepositoryManager;

    public BaseModel(IRepositoryManager IRepositoryManager) {
        mIRepositoryManager = IRepositoryManager;
    }

    /**
     * 在框架中 {@link BasePresenter#onDestroy()} 时会默认调用 {@link IModel#onDestroy()}
     */
    @Override
    public void onDestroy() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestroy(LifecycleOwner owner) {
        owner.getLifecycle().removeObserver(this);
    }
}
