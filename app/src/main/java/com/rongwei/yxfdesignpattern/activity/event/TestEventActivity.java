package com.rongwei.yxfdesignpattern.activity.event;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.rongwei.yxfdesignpattern.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class TestEventActivity extends AppCompatActivity {

    @Bind(R.id.btn_test)
    Button btnTest;
    @Bind(R.id.mylinearlayout)
    MyLinearLayout mylinearlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_event);
        ButterKnife.bind(this);
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("TAG", "onClick execute");
            }
        });

        btnTest.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.e("TAG", "onTouch execute, action " + event.getAction());
                return false;
            }
        });

        mylinearlayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.e("TAG", "mylinearlayout onTouch execute, action " + event.getAction());
                return false;
            }
        });

        mylinearlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("TAG", "mylinearlayout onClick execute");
            }
        });


    }
}
