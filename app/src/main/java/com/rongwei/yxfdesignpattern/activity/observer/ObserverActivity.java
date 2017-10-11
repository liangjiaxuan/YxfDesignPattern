package com.rongwei.yxfdesignpattern.activity.observer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.rongwei.yxfdesignpattern.R;
import com.rongwei.yxfdesignpattern.activity.observer.myself.ObServer1;
import com.rongwei.yxfdesignpattern.activity.observer.myself.ObjectFor3D;
import com.rongwei.yxfdesignpattern.activity.observer.myself.ObjectForZuQiu;
import com.rongwei.yxfdesignpattern.activity.observer.myself.Observer2;
import com.rongwei.yxfdesignpattern.activity.observer.myself.SubjectObserver;
import com.rongwei.yxfdesignpattern.activity.observer.myself.ZuQiuObserver;
import com.rongwei.yxfdesignpattern.activity.observer.system.Observer1;
import com.rongwei.yxfdesignpattern.activity.observer.system.Obsever2;
import com.rongwei.yxfdesignpattern.activity.observer.yxf.YxfLoveNews;
import com.rongwei.yxfdesignpattern.activity.observer.yxf.YxfObserver1;
import com.rongwei.yxfdesignpattern.activity.observer.yxf.YxfObserver2;
import com.rongwei.yxfdesignpattern.activity.observer.yxf.YxfTouTiaoNew;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ObserverActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.bt_observer, R.id.bt_myself, R.id.bt_system})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_myself://自定义
               myselfDefine();
                break;
            case R.id.bt_system://系统
                systemObsever();
                break;
        }
    }

    /**
     * 自定义
     */
    private void myselfDefine() {
        ObjectFor3D objectFor3D=new ObjectFor3D();

        ObjectForZuQiu objectForZuQiu=new ObjectForZuQiu();

        ObServer1 obServer1=new ObServer1();
        Observer2 observer2=new Observer2();
        obServer1.regiseterObserver(objectFor3D);
        observer2.registerObserver(objectFor3D);

        ZuQiuObserver zuQiuObserver=new ZuQiuObserver();
        zuQiuObserver.registerObserver(objectForZuQiu);

        objectFor3D.setMsg("3D开奖啦。。。。。");
        objectForZuQiu.setMsg("足球开奖啦。。。。。");


        YxfLoveNews yxfLoveNews=new YxfLoveNews();
        YxfTouTiaoNew yxfTouTiaoNew=new YxfTouTiaoNew();
        YxfObserver1 yxfObserver1=new YxfObserver1();
        YxfObserver2 yxfObserver2=new YxfObserver2();
        yxfObserver1.registerObserver(yxfLoveNews);
        yxfObserver1.registerObserver(yxfTouTiaoNew);
        yxfObserver2.registerObserver(yxfLoveNews);
        yxfObserver2.registerObserver(yxfTouTiaoNew);

        yxfLoveNews.setMsg("yxf的love新闻");

        yxfTouTiaoNew.setMsg("yxf的toutiao新闻");

    }

    private void systemObsever() {
        SubjectFor3D subjectFor3D=new SubjectFor3D();
        Observer1 observer1=new Observer1();
        Obsever2 obsever2=new Obsever2();
        observer1.registerObserver(subjectFor3D);
        obsever2.registerObserver(subjectFor3D);
        subjectFor3D.setMsg("开奖啦。。。。");
    }
}
