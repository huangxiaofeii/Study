package ztk.mvp.model;

import ztk.mvp.bean.User;
import ztk.mvp.model.inter.IUserModel;
import ztk.mvp.presenter.listener.OnLoginListener;

public class UserModel implements IUserModel {
    @Override
    public void login(final String userName, final String userPassword, final OnLoginListener listener) {
        //模拟子线程耗时操作
        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //模拟登录成功
                if ("ztk".equals(userName) && "123".equals(userPassword)) {
                    User user = new User();
                    user.setUserName(userName);
                    user.setUserPassword(userPassword);
                    listener.success(user);
                } else {
                    listener.failed();
                }
            }
        }.start();
    }
}
