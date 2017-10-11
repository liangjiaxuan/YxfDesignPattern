package com.rongwei.yxfdesignpattern;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.rongwei.yxfdesignpattern.activity.factory.FactoryActivity;
import com.rongwei.yxfdesignpattern.activity.observer.ObserverActivity;
import com.rongwei.yxfdesignpattern.activity.singleton.SingletonActivity;
import com.rongwei.yxfdesignpattern.activity.strategy.StrategyActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.bt_observer, R.id.bt_factory, R.id.bt_singleton, R.id.bt_strategy, R.id.bt_adapter, R.id.bt_command, R.id.bt_decorator, R.id.bt_facade, R.id.bt_template_method, R.id.bt_state})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_observer://观察者模式
                startActivity(new Intent(this, ObserverActivity.class));
                break;
            case R.id.bt_factory:
                startActivity(new Intent(this, FactoryActivity.class));
                break;
            case R.id.bt_singleton:
                startActivity(new Intent(this, SingletonActivity.class));
                break;
            case R.id.bt_strategy://策略模式
                startActivity(new Intent(this, StrategyActivity.class));
                break;
            case R.id.bt_adapter:
                System.out.println("dhjdhfjdhfjdhf");
                break;
            case R.id.bt_command:
                break;
            case R.id.bt_decorator:
                break;
            case R.id.bt_facade:
                break;
            case R.id.bt_template_method:
                break;
            case R.id.bt_state:
                break;
        }
    }
}
