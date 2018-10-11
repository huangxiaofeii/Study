package ztk.mvp.model.inter;

import ztk.mvp.presenter.listener.OnLoginListener;

public interface IUserModel {

    void login(String userName, String userPassword, OnLoginListener listener);

}
