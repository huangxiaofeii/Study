package ztk.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;

public class MyBroadcastReceiver extends BroadcastReceiver {

    static BroadcastListener broadcastListener;

    @Override
    public void onReceive(Context context, Intent intent) {
        //Bundle bundle = intent.getExtras();
        AudioManager am = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
        int current = am.getStreamVolume( AudioManager.STREAM_SYSTEM );
        broadcastListener.showToast("接收到广播，当前音量："  + current);
    }

    /**
     * 关联接口
     * @param listener
     */
    public static void setBroadcastListener(BroadcastListener listener){
        broadcastListener = listener;
    }

    /**
     * 接口
     */
    public interface BroadcastListener {
        void showToast(String value);
    }
}
