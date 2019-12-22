package com.jayphone.arch.mvp;

/**
 * Created by JayPhone on 2019/12/22
 * 每个 View 都需要实现此类, 以满足规范
 */
public interface IView {
    /** 显示加载框 */
    default void showLoading() {
    }

    /** 隐藏对话框 */
    default void hideLoading() {
    }
}
