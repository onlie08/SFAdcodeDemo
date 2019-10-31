package com.sfmap.demo;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.sfmap.adcode.AdCodeMonitor;
import com.sfmap.adcode.AppManager;

public class MainActivity extends AppCompatActivity {
    private final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdCodeMonitor.init(this); //建议放在applica oncreat里

        new Handler().postDelayed(new Runnable() { //adcode初始化需要一点时间
            @Override
            public void run() {
                int adcode  = AppManager.getInstance().getAdCodeInst().getAdcode(114.121211,30.62626);
                Log.i(TAG,"114.121211,30.62626--adcode:"+adcode);
            }
        },1000);

    }

}
