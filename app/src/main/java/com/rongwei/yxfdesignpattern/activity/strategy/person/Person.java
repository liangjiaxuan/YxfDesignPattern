package com.rongwei.yxfdesignpattern.activity.strategy.person;

/**
 * Created by Administrator on 2017/10/10.
 */

public abstract class Person {
    protected String name;
    private TravelStragy travelStragy;
    private DestinationStragy destinationStragy;

    public String getName() {
        return name;
    }

    public Person setTravelStragy(TravelStragy travelStragy) {
        this.travelStragy = travelStragy;
        return this;
    }

    public Person setDestinationStragy(DestinationStragy destinationStragy) {
        this.destinationStragy = destinationStragy;
        return this;
    }

    public void travel(){
        travelStragy.travel();
    }

    public void detination(){
        destinationStragy.destination();
    }

}
