package ztk.mvp.view;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;

import cn.zz.study.R;
import ztk.mvp.presenter.LoginPresenter;
import ztk.mvp.view.inter.ILoginView;
import ztk.view.BaseActivity;

@ContentView(R.layout.activity_login)
public class LoginActivity extends BaseActivity implements ILoginView {

    @ViewInject(R.id.login_name)
    private EditText etName;
    @ViewInject(R.id.login_password)
    private EditText etPassword;
    @ViewInject(R.id.login_progressbar)
    private ProgressBar progressBar;

    private LoginPresenter presenter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenter = new LoginPresenter(this);

    }


    @Event(R.id.login_submit)
    private void mOnclick(View view) {
        switch (view.getId()) {
            case R.id.login_submit:
                presenter.login();
                break;
            default:
        }
    }

    @Override
    public void setUserName(String userName) {
        etName.setText(userName);
    }

    @Override
    public String getUserName() {
        return etName.getText().toString();
    }

    @Override
    public void setPassword(String password) {
        etPassword.setText(password);
    }

    @Override
    public String getPassword() {
        return etPassword.getText().toString();
    }

    @Override
    public void showToast(String value) {
        Toast.makeText(this, value, Toast.LENGTH_LONG).show();
    }

    @Override
    public void showLoading() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        progressBar.setVisibility(View.GONE);
    }
}
