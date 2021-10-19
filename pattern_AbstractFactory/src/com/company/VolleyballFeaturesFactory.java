package com.company;

public class VolleyballFeaturesFactory implements GameFeaturesFactory{
    @Override
    public Rules showRules() {
        return new VolleyballRules();
    }

    @Override
    public BallType showBallType() {
        return new VolleyballBall();
    }

    @Override
    public ShoesType showShoesType() {
        return new VolleyballShoes();
    }
}
