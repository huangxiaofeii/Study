package ztk.mvp.presenter.listener;

import ztk.mvp.bean.User;

public interface OnLoginListener {

    void success(User user);

    void failed();

}
