package ztk.view;

import android.os.Bundle;
import android.widget.Toast;

import org.xutils.view.annotation.ContentView;

import cn.zz.study.R;
import ztk.broadcast.MyBroadcastReceiver;

@ContentView(R.layout.activity_basis)
public class BasisActivity extends BaseActivity implements MyBroadcastReceiver.BroadcastListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MyBroadcastReceiver.setBroadcastListener(this);
    }

    // 显示Toast信息
    @Override
    public void showToast(String value) {
        Toast.makeText(this, value, Toast.LENGTH_LONG).show();
    }
}