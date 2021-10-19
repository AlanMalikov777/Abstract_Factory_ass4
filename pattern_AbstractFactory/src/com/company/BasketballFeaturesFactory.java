package com.company;

public class BasketballFeaturesFactory implements GameFeaturesFactory{
    @Override
    public Rules showRules() {
        return new BasketballRules();
    }

    @Override
    public BallType showBallType() {
        return new BasketballBall();
    }

    @Override
    public ShoesType showShoesType() {
        return new BasketballShoes();
    }
}
