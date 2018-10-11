package ztk.mvp.view.inter;

public interface ILoginView {

    void setUserName(String userName);
    String getUserName();

    void setPassword(String password);
    String getPassword();

    void showLoading();
    void hideLoading();

    void showToast(String value);

}
