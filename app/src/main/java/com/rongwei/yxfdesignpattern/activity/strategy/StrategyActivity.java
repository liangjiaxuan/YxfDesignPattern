package com.rongwei.yxfdesignpattern.activity.strategy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.rongwei.yxfdesignpattern.R;
import com.rongwei.yxfdesignpattern.activity.strategy.attck.Attack1;
import com.rongwei.yxfdesignpattern.activity.strategy.attck.Attack4;
import com.rongwei.yxfdesignpattern.activity.strategy.defend.Defend;
import com.rongwei.yxfdesignpattern.activity.strategy.defend.Defend3;
import com.rongwei.yxfdesignpattern.activity.strategy.display.Display1;
import com.rongwei.yxfdesignpattern.activity.strategy.display.Display2;
import com.rongwei.yxfdesignpattern.activity.strategy.person.Person1;
import com.rongwei.yxfdesignpattern.activity.strategy.person.Person2;
import com.rongwei.yxfdesignpattern.activity.strategy.person.destination.Destination1;
import com.rongwei.yxfdesignpattern.activity.strategy.person.destination.Destination2;
import com.rongwei.yxfdesignpattern.activity.strategy.person.travel.Car;
import com.rongwei.yxfdesignpattern.activity.strategy.person.travel.Plane;
import com.rongwei.yxfdesignpattern.activity.strategy.role.RoleA;
import com.rongwei.yxfdesignpattern.activity.strategy.role.RoleB;
import com.rongwei.yxfdesignpattern.activity.strategy.run.Run1;
import com.rongwei.yxfdesignpattern.activity.strategy.run.Run2;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class StrategyActivity extends AppCompatActivity {

    @Bind(R.id.bt_strategy_text)
    Button btStrategyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy);
        ButterKnife.bind(this);
        btStrategyText.setText("创建角色A,并设定样子,攻击,逃跑,防御");
    }

    @OnClick({R.id.bt_strategy, R.id.bt_strategy_text})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_strategy:
                break;
            case R.id.bt_strategy_text:
                role();
                break;
        }
    }

    /**
     * 创建游戏角色
     */
    private void role() {
        RoleA roleA=new RoleA("角色A");
        roleA.setAttackBehavior(new Attack1())
                .setDefendBeHavior(new Defend3())
                .setDisplayBehavior(new Display1())
                .setRunBeHavior(new Run2());
        System.out.println("角色A");
        roleA.displa();
        roleA.run();
        roleA.defend();
        roleA.attack();

        System.out.println("=================================================");

        RoleB roleB=new RoleB("角色B");
        roleB.setRunBeHavior(new Run1())
                .setDisplayBehavior(new Display2())
                .setDefendBeHavior(new Defend())
                .setAttackBehavior(new Attack4());
        System.out.println("角色B");
        roleB.displa();
        roleB.run();
        roleB.defend();
        roleB.attack();

        System.out.println("=================================================");

        Person1 person1=new Person1("小明");
        person1.setTravelStragy(new Car())
                .setDestinationStragy(new Destination1());
        System.out.println(person1.getName());
        person1.travel();
        person1.detination();

        System.out.println("=================================================");
        Person2 person2=new Person2("小花");
        person2.setTravelStragy(new Plane())
                .setDestinationStragy(new Destination2());
        System.out.println(person2.getName());
        person2.travel();
        person2.detination();
    }
}
