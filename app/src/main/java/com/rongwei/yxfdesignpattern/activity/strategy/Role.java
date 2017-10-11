package com.rongwei.yxfdesignpattern.activity.strategy;

/**
 * Created by Administrator on 2017/10/10.
 */

/**
 * 角色的超类
 */
public abstract class Role {

    protected String name;

    protected DisplayBehavior displayBehavior;
    protected DefendBeHavior defendBeHavior;
    protected RunBeHavior runBeHavior;
    protected AttackBehavior attackBehavior;

    public Role setDisplayBehavior(DisplayBehavior displayBehavior) {
        this.displayBehavior = displayBehavior;
        return this;
    }

    public Role setDefendBeHavior(DefendBeHavior defendBeHavior) {
        this.defendBeHavior = defendBeHavior;
        return this;
    }

    public Role setRunBeHavior(RunBeHavior runBeHavior) {
        this.runBeHavior = runBeHavior;
        return this;
    }

    public Role setAttackBehavior(AttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
        return this;
    }

    public void displa(){
        displayBehavior.display();
    }

    public void defend(){
        defendBeHavior.defend();
    }

    public void run(){
        runBeHavior.run();
    }

    public void attack(){
        attackBehavior.attack();
    }

}
