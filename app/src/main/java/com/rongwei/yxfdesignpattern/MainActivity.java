package com.rongwei.yxfdesignpattern;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.rongwei.yxfdesignpattern.activity.TestJsActivity;
import com.rongwei.yxfdesignpattern.activity.TestWebviewActivity;
import com.rongwei.yxfdesignpattern.activity.event.TestEventActivity;
import com.rongwei.yxfdesignpattern.activity.factory.FactoryActivity;
import com.rongwei.yxfdesignpattern.activity.observer.ObserverActivity;
import com.rongwei.yxfdesignpattern.activity.singleton.SingletonActivity;
import com.rongwei.yxfdesignpattern.activity.strategy.StrategyActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    private static final int MY_PERMISSIONS_REQUEST_CALL_PHONE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.CALL_PHONE,Manifest.permission.WRITE_EXTERNAL_STORAGE},
                    MY_PERMISSIONS_REQUEST_CALL_PHONE);
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode==MY_PERMISSIONS_REQUEST_CALL_PHONE) {
            if (grantResults[1] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(MainActivity.this, "Permission GRANTED", Toast.LENGTH_SHORT).show();
            } else {
                // Permission Denied
                Toast.makeText(MainActivity.this, "Permission Denied", Toast.LENGTH_SHORT).show();
            }
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @OnClick({R.id.bt_observer, R.id.bt_factory, R.id.bt_singleton, R.id.bt_strategy, R.id.bt_adapter,
            R.id.bt_command, R.id.bt_decorator, R.id.bt_facade, R.id.bt_template_method, R.id.bt_state,
            R.id.bt_event_fenfa, R.id.btn_webview, R.id.btn_js})
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
            case R.id.bt_event_fenfa:
                startActivity(new Intent(this, TestEventActivity.class));
                break;
            case R.id.btn_webview:
                startActivity(new Intent(this, TestWebviewActivity.class));
                break;
            case R.id.btn_js:
                startActivity(new Intent(this, TestJsActivity.class));
                break;
        }
    }
}
