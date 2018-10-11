package ztk.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import cn.zz.study.R;
import ztk.mvp.view.LoginActivity;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.basis).setOnClickListener(this);

        findViewById(R.id.mvp).setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.basis:
                startActivity(new Intent(this,BasisActivity.class));
                break;
            case R.id.mvp:
                startActivity(new Intent(this, LoginActivity.class));
                break;
            default:
        }
    }
}
