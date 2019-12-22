package com.jayphone.arch.mvp;

import android.app.Activity;

/**
 * Created by JayPhone on 2019/12/22
 * 每个 Presenter 都需要实现此类,以满足规范
 */
public interface IPresenter {
    /** 执行初始化工作 */
    void onStart();

    /** 在{@link Activity#onDestroy()}中默认调用 */
    void onDestroy();
}
