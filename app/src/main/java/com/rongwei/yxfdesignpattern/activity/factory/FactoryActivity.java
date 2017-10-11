package com.rongwei.yxfdesignpattern.activity.factory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.rongwei.yxfdesignpattern.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class FactoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.bt_static_factory, R.id.bt_simple_factory, R.id.bt_factory_method, R.id.bt_abstract_factory})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_static_factory:
                Toast.makeText(this, "TextUtil.isEmpty等，类+静态方法.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_simple_factory://简单工程模式
                RouJiaMo jiaMo = SimpleRoujiaMoFactory.createRouJiaMo("La");
                jiaMo.prepare();
                jiaMo.fire();
                jiaMo.pack();
                break;
            case R.id.bt_factory_method:
                break;
            case R.id.bt_abstract_factory:
                break;
        }
    }
}
