package ztk.mvp.presenter;

import android.os.Handler;

import ztk.mvp.bean.User;
import ztk.mvp.model.UserModel;
import ztk.mvp.model.inter.IUserModel;
import ztk.mvp.presenter.listener.OnLoginListener;
import ztk.mvp.view.inter.ILoginView;

public class LoginPresenter {

    ILoginView iLoginView;
    IUserModel iUserModel;
    Handler mHandler = new Handler();

    public LoginPresenter(ILoginView iLoginView) {
        this.iLoginView = iLoginView;
        iUserModel = new UserModel();
    }

    public void login() {
        iLoginView.showLoading();
        iUserModel.login(iLoginView.getUserName(), iLoginView.getPassword(), new OnLoginListener() {
            @Override
            public void success(User user) {
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        iLoginView.hideLoading();
                        iLoginView.showToast("登录成功");
                    }
                });
            }

            @Override
            public void failed() {
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        iLoginView.hideLoading();
                        iLoginView.showToast("登录失败");
                    }
                });
            }
        });
    }

}
