package com.rongwei.yxfdesignpattern.activity.singleton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.rongwei.yxfdesignpattern.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class SingletonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.bt_ehan, R.id.bt_lanhan, R.id.bt_inclass, R.id.bt_enum})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_ehan://饿汉
                SingletonEHan instance = SingletonEHan.getInstance();
                break;
            case R.id.bt_lanhan://懒汉  双重锁 线程安全
                SingletonLanHan singleLanhanInstance = SingletonLanHan.getSingleLanhanInstance();
                break;
            case R.id.bt_inclass://内部类
                SingletonIn singletonInstance = SingletonIn.getSingletonInstance();
                break;
            case R.id.bt_enum://枚举
                SingletonEnum anEnum = SingletonEnum.instance;

                break;
        }
    }
}
