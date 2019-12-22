package com.jayphone.arch.mvp;

/**
 * Created by JayPhone on 2019/12/22
 * 每个 Model 都需要实现此类,以满足规范
 */
public interface IModel {
    /**
     * 在框架中 {@link BasePresenter#onDestroy()} 时会默认调用 {@link IModel#onDestroy()}
     */
    void onDestroy();
}
